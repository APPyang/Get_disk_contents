package com.yzt.reader;

import java.util.List;

public class DocumentData {
    private String title;
    private List<List<String>> content;

    public DocumentData(String title, List<List<String>> content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<List<String>> getContent() {
        return content;
    }

    public void setContent(List<List<String>> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DocumentData{" +
                "title='" + title + '\'' +
                ", content=" + content +
                '}';
    }
}