package com.juniorrodrigues.cardview.model;

public class CardModel {

    private String userName;
    private String postated;
    private int image;

    public CardModel() {
    }

    public CardModel(String userName, String postated, int image) {
        this.userName = userName;
        this.postated = postated;
        this.image = image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPostated() {
        return postated;
    }

    public void setPostated(String postated) {
        this.postated = postated;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
