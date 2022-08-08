package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Borrower implements Serializable
{
  private String name;
  private String emailId;
  private int phoneNumber;
  private String role;

  private ArrayList<Book>books;
  private  ArrayList<Article> articles;


  public Borrower( String name, String emailId, int phoneNumber, String role){
    this.name=name;
    this.emailId=emailId;
    this.phoneNumber=phoneNumber;
    this.role=role;
    books=new ArrayList<>();
    articles=new ArrayList<>();

  }





  public String getName()
  {
    return name;
  }

  public String getEmailId()
  {
    return emailId;
  }

  public String getRole()
  {
    return role;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void addBook(Book book){
    books.add(book);
  }
  public void addArticle(Article article){
    articles.add(article);
  }

  public void removeBook(int index){
    books.remove(index);
  }
  public void removeBook(Book book){
    books.remove(book);
  }
  public Book getBook(int index){
    return books.get(index);
  }
  public Book[] getAllBooks(){
    Book[] allBook=new Book[books.size()];
    return books.toArray(allBook);
  }

  public void removeArticle(int index){
    articles.remove(index);
  }

  public Article getArticle(int index){
    return articles.get(index);
  }

  public Article[] getAllArticles(){
    Article[] allArticle=new Article[articles.size()];
    return articles.toArray(allArticle);

  }





  public void set(String name, String emailId, String role, int phoneNumber)
  {
    this.name = name;
    this.emailId=emailId;
    this.phoneNumber=phoneNumber;
    this.role=role;
  }


  @Override public String toString()
  {
    return "model.Borrower{" + "name='" + name + '\'' + ", emailId='" + emailId + '\''
        + ", phoneNumber=" + phoneNumber + ", role='" + role + '\'' +  '}';
  }

  @Override public boolean equals(Object o)
  {
    if (!(o instanceof Objects))
      return false;
    Borrower borrower = (Borrower) o;
    return phoneNumber == borrower.phoneNumber && Objects.equals(name,
        borrower.name) && Objects.equals(emailId, borrower.emailId)
        && Objects.equals(role, borrower.role);
  }


}
