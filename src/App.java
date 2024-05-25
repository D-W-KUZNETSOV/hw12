public class App {

  public static void main(String[] args) {
    Author pushkin = new Author("Александр", "Пушкин");
    Book cockerel = new Book(pushkin, "Сказка о золотом петушке", 2023);
    cockerel.setYearPublisher(2000);

    Author tolstoy = new Author("Алексей", "Толстой");
    Book buratino = new Book(tolstoy, "Приключения Буратино", 1985);
    buratino.setYearPublisher(1997);

    System.out.println(tolstoy + ", " + buratino);
    System.out.println(pushkin + ", " + cockerel);
    System.out.println("pushkin.hashCode() = " + pushkin.hashCode());
    System.out.println("tolstoy.hashCode() = " + tolstoy.hashCode());
    System.out.println("pushkin.equals(tolstoy) = " + pushkin.equals(tolstoy));
    System.out.println(
        "pushkin.getLastName().equals(tolstoy.getLastName()) = " + pushkin.getLastName()
            .equals(tolstoy.getLastName()));
    System.out.println(
        "pushkin.getFirstName().equals(tolstoy.getFirstName()) = " + pushkin.getFirstName()
            .equals(tolstoy.getFirstName()));


  }
}
