package com.example.firebasecruddemo;

public class User {
    private String userid;
    private String username;

    public User(String userid, String username, String useremail, String usermobileno) {
        this.userid = userid;
        this.username = username;
        this.useremail = useremail;
        this.usermobileno = usermobileno;
    }

    private String useremail;

    private String usermobileno;

    public User() {

    }
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUsermobileno() {
        return usermobileno;
    }

    public void setUsermobileno(String usermobileno) {
        this.usermobileno = usermobileno;
    }



}