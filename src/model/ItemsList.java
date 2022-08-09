package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ItemsList implements Serializable {

    private ArrayList<Book> books;
    private ArrayList<Article> articles;


    public ItemsList() {
        books = new ArrayList<>();
        articles = new ArrayList<>();
    }

    public int bookSize() {
        return books.size();
    }

    public int articleSize() {
        return articles.size();
    }

    public void addBook(Book book) {
        books.add(book);

    }

    public void addArticle(Article article) {
        articles.add(article);
    }


    public void removeBook(Book book) {
        for (Book book1: books
             ) {
            if (book1.getIsbn()==book.getIsbn()){
                System.out.println(book.getIsbn() + "Removing this one " + book1.getTitle());
                books.remove(book1);
                break;
            }

        }

    }


    public void removeArticle(Article article) {

        ArrayList<Article> temp = new ArrayList<>();
        for (int i = 0; i < articleSize(); i++) {
            if (!articles.get(i).equals(article)) {
                temp.add(articles.get(i));
            }
        }
        articles = temp;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public ArrayList<Article> getAllArticles() {

        return articles;
    }

    public void sortBook() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book t1, Book t2) {
                return t1.getTitle().compareTo(t2.getTitle());
            }
        });
    }

    public void sortArticles() {
        Collections.sort(articles, new Comparator<Article>() {
            @Override
            public int compare(Article t1, Article t2) {
                return t1.getTitle().compareTo(t2.getTitle());
            }
        });
    }


    @Override
    public String toString() {
        return "ItemsList{" +
                "books=" + books +
                ", articles=" + articles +
                '}';
    }
}
