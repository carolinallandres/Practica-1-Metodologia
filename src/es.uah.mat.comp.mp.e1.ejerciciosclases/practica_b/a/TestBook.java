package es.uah.matcomp.mp.e1.ejerciciosclases.practica_b.a;

public class TestBook {
    public static void main(String[] args) {

        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);

        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);

        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());

        System.out.println("Author is: " + dummyBook.getAuthor());

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        System.out.println("Author name (shortcut): " + dummyBook.getAuthorName());
        System.out.println("Author email (shortcut): " + dummyBook.getAuthorEmail());
        System.out.println("Author gender (shortcut): " + dummyBook.getAuthorGender());

        Book anotherBook = new Book(
                "More Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'),
                29.95
        );

        System.out.println(anotherBook);
    }
}

