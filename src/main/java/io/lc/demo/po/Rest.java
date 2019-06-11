package io.lc.demo.po;

import java.util.Date;

public class Rest {
    private Integer rid;

    private String rname;

    private String rdept;

    private String rtitle;

    private Date rstart;

    private Date rstop;

    private Integer rdaycount;

    private String rtype;

    private String rresson;

    private String rcheck;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRdept() {
        return rdept;
    }

    public void setRdept(String rdept) {
        this.rdept = rdept == null ? null : rdept.trim();
    }

    public String getRtitle() {
        return rtitle;
    }

    public void setRtitle(String rtitle) {
        this.rtitle = rtitle == null ? null : rtitle.trim();
    }

    public Date getRstart() {
        return rstart;
    }

    public void setRstart(Date rstart) {
        this.rstart = rstart;
    }

    public Date getRstop() {
        return rstop;
    }

    public void setRstop(Date rstop) {
        this.rstop = rstop;
    }

    public Integer getRdaycount() {
        return rdaycount;
    }

    public void setRdaycount(Integer rdaycount) {
        this.rdaycount = rdaycount;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype == null ? null : rtype.trim();
    }

    public String getRresson() {
        return rresson;
    }

    public void setRresson(String rresson) {
        this.rresson = rresson == null ? null : rresson.trim();
    }

    public String getRcheck() {
        return rcheck;
    }

    public void setRcheck(String rcheck) {
        this.rcheck = rcheck == null ? null : rcheck.trim();
    }
}