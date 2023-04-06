package ru.faang.school.hashmap.task_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Book, String> libraryVesteros = new HashMap<>();
    public static void main(String[] args) {
        Book flameAndIce = new Book("Песнь льда и пламени", "Кто-то", 800);
        Book bloodyMercy = new Book("Кровавая свадьба", "Джофри", 1200);
        Book winter = new Book("Зима", "Король Севера", 1);
        Book unknownBook = new Book(null, null, 0);
        addBook( flameAndIce ,"под столом у библиотекаря");
        addBook(bloodyMercy , "в запретной секции");
        addBook(winter, "на 3 этаже, 5 ряд, 3 полка, 17 справа");
        addBook(unknownBook, "в подвале");
        showAllBooks();
        showBook(winter);
        showBook(unknownBook);
        deleteBook(unknownBook);
        showAllBooks();
    }

    public static void addBook(Book book, String locate){
        libraryVesteros.put(book, locate);
    }

    public static void deleteBook(Book book){
        libraryVesteros.remove(book);
    }

    public static void showBook(Book book){
        System.out.println(book + libraryVesteros.get(book) + "\n-----------------------------");
    }

    public static void showAllBooks(){
        for (Map.Entry<Book, String> entry : libraryVesteros.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        System.out.println("-----------------------------");
    }
}
