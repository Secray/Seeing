package com.sye.seeing.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "MARKDOWN".
 */
public class Markdown {

    private Long id;
    private String title;
    private Long createTime;
    private Long lastTime;
    private String content;
    private String localPath;
    private Long size;

    public Markdown() {
    }

    public Markdown(Long id) {
        this.id = id;
    }

    public Markdown(Long id, String title, Long createTime, Long lastTime, String content, String localPath, Long size) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
        this.lastTime = lastTime;
        this.content = content;
        this.localPath = localPath;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastTime() {
        return lastTime;
    }

    public void setLastTime(Long lastTime) {
        this.lastTime = lastTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

}