import java.util.Objects;

public class Author {

  private String firstName;
  private String lastName;

  public Author(String firstName, String lastName) {

    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String toString() {
    return this.firstName + " " + " " + this.lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(firstName, author.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(firstName);
  }
}


