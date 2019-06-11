package io.lc.demo.po;

public class User {
    private Integer uid;

    private String username;

    private String password;

    private Integer hoildaynum;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getHoildaynum() {
        return hoildaynum;
    }

    public void setHoildaynum(Integer hoildaynum) {
        this.hoildaynum = hoildaynum;
    }

//    public String getSalt() {
//        return salt;
//    }
//    public void setSalt() {
//        this.salt = salt ==null?null:salt.trim();
//    }
}