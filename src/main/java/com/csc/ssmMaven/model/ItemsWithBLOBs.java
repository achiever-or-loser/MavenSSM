package com.csc.ssmMaven.model;

public class ItemsWithBLOBs extends Items {
    private String detail;

    private byte[] pic;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}