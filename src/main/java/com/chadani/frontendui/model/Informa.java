package com.chadani.frontendui.model;

public class Informa {
    public String name;
    public String email;
    public String message;
    public String profileUrl;

    public Informa() {
    }

    public Informa(String name, String email, String message, String profileUrl) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.profileUrl = profileUrl;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
