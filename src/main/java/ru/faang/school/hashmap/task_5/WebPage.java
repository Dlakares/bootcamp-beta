package ru.faang.school.hashmap.task_5;

public class WebPage {
    private String URL;
    private String title;
    private String content;

    public WebPage(String URL, String title, String content) {
        this.URL = URL;
        this.title = title;
        this.content = content;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return title;
    }
}
