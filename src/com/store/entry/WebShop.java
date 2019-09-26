package com.store.entry;

import java.io.Serializable;
import java.util.Date;

public class WebShop implements Serializable {
    private Integer wshId;
    private String wshImg;
    private String wshName;
    private String wshDetail;
    private Date wshRenewDate;
    private Integer wshCount;
    private Integer wshSize;

    public WebShop() {
    }

    public WebShop(Integer wshId, String wshImg, String wshName, String wshDetail, Date wshRenewDate, Integer wshCount, Integer wshSize) {
        this.wshId = wshId;
        this.wshImg = wshImg;
        this.wshName = wshName;
        this.wshDetail = wshDetail;
        this.wshRenewDate = wshRenewDate;
        this.wshCount = wshCount;
        this.wshSize = wshSize;
    }

    public Integer getWshId() {
        return wshId;
    }

    public void setWshId(Integer wshId) {
        this.wshId = wshId;
    }

    public String getWshImg() {
        return wshImg;
    }

    public void setWshImg(String wshImg) {
        this.wshImg = wshImg;
    }

    public String getWshName() {
        return wshName;
    }

    public void setWshName(String wshName) {
        this.wshName = wshName;
    }

    public String getWshDetail() {
        return wshDetail;
    }

    public void setWshDetail(String wshDetail) {
        this.wshDetail = wshDetail;
    }

    public Date getWshRenewDate() {
        return wshRenewDate;
    }

    public void setWshRenewDate(Date wshRenewDate) {
        this.wshRenewDate = wshRenewDate;
    }

    public Integer getWshCount() {
        return wshCount;
    }

    public void setWshCount(Integer wshCount) {
        this.wshCount = wshCount;
    }

    public Integer getWshSize() {
        return wshSize;
    }

    public void setWshSize(Integer wshSize) {
        this.wshSize = wshSize;
    }

    @Override
    public String toString() {
        return "WebShop{" +
                "wshId=" + wshId +
                ", wshImg='" + wshImg + '\'' +
                ", wshName='" + wshName + '\'' +
                ", wshDetail='" + wshDetail + '\'' +
                ", wshRenewDate=" + wshRenewDate +
                ", wshCount=" + wshCount +
                ", wshSize=" + wshSize +
                '}';
    }
}
