package com.example.apm_luzidio;

import java.io.Serializable;

public class Tema implements Serializable {

    private String author;
    private String theme;
    private String description;

    public Tema(String author, String theme, String description) {
        this.author = author;
        this.theme = theme;
        this.description = description;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "author='" + author + '\'' +
                ", theme='" + theme + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
