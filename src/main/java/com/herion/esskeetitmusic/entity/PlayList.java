package com.herion.esskeetitmusic.entity;

public class PlayList {
    private String listName;        // 歌单名
    private String introduction;    // 简介
    private int hot;                // 热度
    private int id;                 // 编号
    private String type;            // 标签（分类）
    private int starNum;            // 收藏数量
    private String state;           // 状态

    public PlayList(){}

    public PlayList(String listName, String introduction, int hot, int id, String type, int starNum, String state){
        this.listName = listName;
        this.introduction = introduction;
        this.hot = hot;
        this.id = id;
        this.type = type;
        this.starNum = starNum;
        this.state = state;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStarNum() {
        return starNum;
    }

    public void setStarNum(int starNum) {
        this.starNum = starNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "listName='" + listName + '\'' +
                ", introduction='" + introduction + '\'' +
                ", hot=" + hot +
                ", id=" + id +
                ", type='" + type + '\'' +
                ", starNum=" + starNum +
                ", state='" + state + '\'' +
                '}';
    }
}
