package com.dreyer.facade.notify.service;

import com.dreyer.common.params.MailParam;
import com.dreyer.facade.notify.enums.NotifyTypeEnum;

/**
 * @author: Dreyer
 * @date: 16/6/18 下午9:59
 * @description: 向MQ发送消息的服务, 单独抽离出来, 其他服务只要调用即可, 不用在调用服务方引入MQ
 */
public interface NotifySendFacade {


    /**
     * 发送邮件通知
     *
     * @param mailParam
     */
    void sendMailNotify(MailParam mailParam);

    /**
     * 发送消息通知
     *
     * @param notifyUrl       通知地址
     * @param notifyTypeEnum  通知类型
     * @param merchantOrderNo 通知订单号
     * @param merchantNo      通知商户号
     */
    void notifySend(String notifyUrl, NotifyTypeEnum notifyTypeEnum, String merchantOrderNo, String merchantNo);

}
