package com.example.recycler_intent.recycler;

public class msg_item {
    private String name;
    private String text;
    private String SendTime;
    private int ImgID;

    public msg_item(String name, String text, String time, int ImgID) {
        this.name = name;
        this.text = text;
        this.SendTime = time;
        this.ImgID = ImgID;
    }

    public String GetName() {
        return name;
    }

    public String GetText() {
        return text;
    }

    public int GetImgID() {
        return ImgID;
    }

    public String GetSendTime() {
        return SendTime;
    }
}
