package com.dreyer.facade.notify.service;


import com.dreyer.common.exception.BizException;
import com.dreyer.common.page.PageParam;
import com.dreyer.common.page.Pager;
import com.dreyer.common.params.MailParam;
import com.dreyer.facade.notify.entity.NotifyRecord;
import com.dreyer.facade.notify.entity.NotifyRecordLog;

import java.util.Map;

/**
 * @author: Dreyer
 * @date: 16/6/15 下午10:04
 * @description: 通知服务接口
 */
public interface NotifyFacade {

    /**
     * 查询商户通知记录.<br/>
     *
     * @param id
     * @return
     * @throws BizException
     */
    public NotifyRecord getNotifyById(Long id) throws BizException;

    /**
     * 创建商户通知记录.<br/>
     *
     * @param notifyRecord
     * @return
     * @throws BizException
     */
    public long creatNotifyRecord(NotifyRecord notifyRecord) throws BizException;

    /**
     * 更新商户通知记录.<br/>
     *
     * @param notifyRecord
     * @return
     * @throws BizException
     */
    public long updateNotifyRecord(NotifyRecord notifyRecord) throws BizException;

    /**
     * 创建商户通知日志记录.<br/>
     *
     * @param notifyRecordLog
     * @return
     * @throws BizException
     */
    public long creatNotifyRecordLog(NotifyRecordLog notifyRecordLog) throws BizException;


//	/**
//	 * 查询商户通知记录.<br/>
//	 *
//	 * @param merchantNo
//	 *            商户编号.
//	 * @param merchantOrderNo
//	 *            商户订单号.
//	 * @return notifyType.
//	 *            通知类型
//	 */
//	public NotifyRecord getNotifyByMerchantNoAndMerchantOrderNoAndNotifyType(String merchantNo, String merchantOrderNo, Integer notifyType) throws BizException;


	/**
	 * 根据传入参数分页查询
	 *
	 * @param pageParam
	 *            分页参数
	 * @param paramMap
	 *            查询参数
	 * @return 查询结果
	 */
	public Pager<NotifyRecord> queryNotifyRecordListPage(PageParam pageParam, Map<String, Object> paramMap) throws BizException;
//
//	/**
//	 * 根据传入参数分页查询
//	 *
//	 * @param pageParam
//	 *            分页参数
//	 * @param paramMap
//	 *            查询参数
//	 * @return 查询结果
//	 */
//	public PageBean queryNotifyRecordLogListPage(PageParam pageParam, Map<String, Object> paramMap) throws BizException;


}
