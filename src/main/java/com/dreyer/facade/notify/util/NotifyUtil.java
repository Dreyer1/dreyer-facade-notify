package com.dreyer.facade.notify.util;

import com.alibaba.fastjson.JSONObject;
import com.dreyer.common.config.PublicConfig;
import com.dreyer.common.params.MailParam;
import com.dreyer.common.util.StringUtil;
import com.dreyer.facade.notify.entity.NotifyRecord;
import com.dreyer.facade.notify.enums.NotifyStatusEnum;
import com.dreyer.facade.notify.enums.NotifyTypeEnum;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author: Dreyer
 * @date: 16/6/15 下午11:06
 * @description: 队列发送工具类, 负责把需要发送的消息转换为NotifyRecord的字符串形式
 */
public class NotifyUtil {
    private static Logger logger = Logger.getLogger(NotifyUtil.class);
    /**
     * 编码类型 UTF-8.
     */
    private static final String UTF_8 = "utf-8";

    /**
     *
     */
    private static final String NOTITY_RECEIVE_URL = PublicConfig.NOTIFY_RECEIVE_URL;

    /**
     * 通知的最大次数
     */
    private static final String NOTIFY_LIMIT = PublicConfig.NOTIFY_LIMIT;

    /**
     * 邮件
     *
     * @param mail
     * @return
     */
    public static String formatMail(MailParam mail) {
        // 转与Json
        String msg = JSONObject.toJSONString(mail);
        try {
            // 加密传输
            msg = URLEncoder.encode(Base64.encodeBase64String(msg.getBytes(UTF_8)), UTF_8);
        } catch (UnsupportedEncodingException e) {
            logger.error("==>UnsupportedEncodingException:", e);
        }

        final NotifyRecord notifyRecord = new NotifyRecord();
        Short shortVa = new Short(new Integer(NotifyTypeEnum.MAIL.getValue()).toString());
        notifyRecord.setNotifyType(shortVa);
        notifyRecord.setMerchantNo(mail.getTo());
        notifyRecord.setNotifyTimes(toShort(0));
        notifyRecord.setLimitNotifyTimes(toShort(NOTIFY_LIMIT));
        notifyRecord.setStatus(toShort(NotifyStatusEnum.CREATED.getValue()));
        notifyRecord.setMerchantOrderNo(StringUtil.getUUID());
        notifyRecord.setVersion(toShort(1));

        notifyRecord.setUrl(NOTITY_RECEIVE_URL + "mail/receive?msg=" + msg);

        return JSONObject.toJSONString(notifyRecord);
    }


    /**
     * @param val
     * @return
     */
    private static Short toShort(Integer val) {
        return new Short(val.toString());
    }

    /**
     * @param val
     * @return
     */
    private static Short toShort(String val) {
        return new Short(val);
    }

}
