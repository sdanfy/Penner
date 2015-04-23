package com.penner.model;

public class User extends BaseModel{
    private int userId;
    private String username;
    private String userPassword;
    private String userMail;
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUserPassword() {
        return userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    public String getUserMail() {
        return userMail;
    }
    
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    
}
