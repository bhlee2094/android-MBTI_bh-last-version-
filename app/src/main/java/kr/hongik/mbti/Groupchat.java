package kr.hongik.mbti;

public class Groupchat {
    private int gchat_image;
    private String gchatId;

    public Groupchat() {
    }

    public Groupchat(int gchat_image, String gchatId) {
        this.gchat_image = gchat_image;
        this.gchatId = gchatId;
    }

    public int getGchat_image() {
        return gchat_image;
    }

    public void setGchat_image(int gchat_image) {
        this.gchat_image = gchat_image;
    }

    public String getGchatId() {
        return gchatId;
    }

    public void setGchatId(String gchatId) {
        this.gchatId = gchatId;
    }
}