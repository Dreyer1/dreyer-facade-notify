package com.dreyer.facade.notify.entity;

import java.io.Serializable;
import java.util.Date;

public class NotifyRecord implements Serializable {
    private Long id;

    private Short version;

    private Date createTime;

    /**
     * 最后一次通知时间
     */
    private Date lastNotifyTime;

    /**
     * 通知次数
     */
    private Short notifyTimes;

    /**
     * 最大通知次数
     */
    private Short limitNotifyTimes;

    /**
     * 通知地址
     */
    private String url;

    /**
     * 商户订单号
     */
    private String merchantOrderNo;

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 通知状态(100:成功:101:未成功,默认101)
     **/
    private Short status;

    /**
     * 通知类型 NotifyTypeEnum
     **/
    private Short notifyType;

    private static final long serialVersionUID = 1L;

    public NotifyRecord() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastNotifyTime() {
        return lastNotifyTime;
    }

    public void setLastNotifyTime(Date lastNotifyTime) {
        this.lastNotifyTime = lastNotifyTime;
    }

    public Short getNotifyTimes() {
        return notifyTimes;
    }

    public void setNotifyTimes(Short notifyTimes) {
        this.notifyTimes = notifyTimes;
    }

    public Short getLimitNotifyTimes() {
        return limitNotifyTimes;
    }

    public void setLimitNotifyTimes(Short limitNotifyTimes) {
        this.limitNotifyTimes = limitNotifyTimes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(Short notifyType) {
        this.notifyType = notifyType;
    }
}