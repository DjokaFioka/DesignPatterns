package org.example.behavioral.memento.banas;

public class Originator {
    private String article;

    public void setArticle(String article) {
        System.out.println("From Originator: Current Version of Article\n" + article + "\n");
        this.article = article;
    }

    public Memento storeInMemento() {
        System.out.println("From Originator: Saving to Memento");
        return new Memento(this.article);
    }

    public String restoreFromMemento(Memento memento) {
        article = memento.getSavedArticle();
        System.out.println("From Originator: Previous Article Saved in Memento\n" + article + "\n");
        return article;
    }
}
