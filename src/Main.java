import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Book cockerel = new Book ( pushkin, "Сказка о золотом петушке", 2023);
        cockerel.setYearPublisher(2000);

        System.out.println(cockerel.getAuthor().getFirstName()+" "+ cockerel.getAuthor().getLastName());
        System.out.println(cockerel.getTitle()+" "+cockerel.getYearPublisher());

        Author tolstoy = new Author("Алексей", "Толстой");
        Book buratino = new Book(tolstoy, "Приключения Буратино", 1985);
        buratino.setYearPublisher(1997);

        System.out.println(buratino.getAuthor().getFirstName()+ " " + buratino.getAuthor().getLastName());
        System.out.println(buratino.getTitle() + " " + buratino.getYearPublisher());


    }



    }
