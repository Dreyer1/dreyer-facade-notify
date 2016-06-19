package com.dreyer.facade.notify.entity;

import java.io.Serializable;
import java.util.Date;

public class NotifyRecordLog implements Serializable {
    private Long id;

    private Short version;

    private Date createTime;

    /**
     * 通知记录ID
     */
    private Long notifyId;

    /**
     * 请求信息
     */
    private String request;

    /**
     * 响应信息
     */
    private String response;

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 商户订单号
     */
    private String merchantOrderNo;

    /**
     * 请求状态
     */
    private Short httpStatus;

    private static final long serialVersionUID = 1L;

    public NotifyRecordLog() {
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

    public Long getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(Long notifyId) {
        this.notifyId = notifyId;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    public Short getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(Short httpStatus) {
        this.httpStatus = httpStatus;
    }
}