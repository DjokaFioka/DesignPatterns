package org.example.behavioral.memento.banas;

public class Memento {
    private final String article;

    public Memento(String article) {
        this.article = article;
    }

    public String getSavedArticle() {
        return article;
    }
}
