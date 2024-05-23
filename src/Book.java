public class Book {

  private String title;
  private int yearPublisher;
  private Author author;

  public Book(Author author, String title, int yearPublisher) {
    this.title = title;
    this.yearPublisher = yearPublisher;
    this.author = author;
  }

  public Author getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getYearPublisher() {
    return yearPublisher;
  }

  public void setYearPublisher(int yearPublisher) {
    this.yearPublisher = yearPublisher;
  }


  }








