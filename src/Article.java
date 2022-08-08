import java.util.Objects;

public class Article extends Items
{
  private String magazine;

  public Article( String magazine, String title, String author){
    super(title, author);
    this.magazine=magazine;
  }

  public String getMagazine()
  {
    return magazine;
  }

  public void setMagazine(String magazine)
  {
    this.magazine = magazine;
  }

  @Override public boolean equals(Object o)
  {
    if (!(o instanceof Objects))
      return false;

    if (!super.equals(o))
      return false;
    Article article = (Article) o;
    return Objects.equals(magazine, article.magazine);
  }

  @Override
  public String toString() {
    return super.toString() + ", Magazine: "+ magazine;
  }
}

