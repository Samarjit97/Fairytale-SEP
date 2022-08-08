import java.util.Objects;

public class Items
{
  private String title;
  private String author;

  public Items( String title, String author){
    this.title = title;
    this.author= author;
  }

  public String getTitle() {
    return title;
  }



  public String getAuthor() {
    return author;
  }


  @Override public String toString()
  {
    return "title: = " + title + ", author: = " + author;
  }

  @Override public boolean equals(Object o)
  {
    if (!(o instanceof Objects))
      return false;

    Items items = (Items) o;
    return Objects.equals(title, items.title) && Objects.equals(author,
        items.author);
  }

}
