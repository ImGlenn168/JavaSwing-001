package com.java.entity;

public class Customer {
    private String cid;

    private String cname;

    private String phoneNumber;

    private String weChat;

    private String note;

    public Customer() {
    }

    public Customer(String cid, String cname, String phoneNumber, String weChat, String note) {
        this.cid = cid;
        this.cname = cname;
        this.phoneNumber = phoneNumber;
        this.weChat = weChat;
        this.note = note;
    }

    public Customer(String cname, String phoneNumber, String weChat, String note) {
        this.cname = cname;
        this.phoneNumber = phoneNumber;
        this.weChat = weChat;
        this.note = note;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", weChat='" + weChat + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Customer customer = (Customer) obj;
        return customer.getCid() == (this.cid);
    }
}
