package com.lou.pojo;

public class Sp {
    private Integer id;

    private String sid;

    private String sname;

    private String danjia;

    private String tiaoma;

    private String danwei;

    private String zhekou;

    private String huiyuanjia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getDanjia() {
        return danjia;
    }

    public void setDanjia(String danjia) {
        this.danjia = danjia == null ? null : danjia.trim();
    }

    public String getTiaoma() {
        return tiaoma;
    }

    public void setTiaoma(String tiaoma) {
        this.tiaoma = tiaoma == null ? null : tiaoma.trim();
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei == null ? null : danwei.trim();
    }

    public String getZhekou() {
        return zhekou;
    }

    public void setZhekou(String zhekou) {
        this.zhekou = zhekou == null ? null : zhekou.trim();
    }

    public String getHuiyuanjia() {
        return huiyuanjia;
    }

    public void setHuiyuanjia(String huiyuanjia) {
        this.huiyuanjia = huiyuanjia == null ? null : huiyuanjia.trim();
    }
}