package lessons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LessonTwoServiceTest {

    private List<Book> books;

    private LessonTwoService lessonTwoService;
    private LessonTwoTestData testData;

    @BeforeEach
    void setUp() {
        testData = new LessonTwoTestData();
        books = testData.getBooks();

        lessonTwoService = new LessonTwoService();
    }

    @Test
    void findBookById() {
        Book result = lessonTwoService.findBookById(books, 4);

        assertEquals(books.get(3), result, "Results do not match");
    }

    @Test
    void addBookToList() {
        Book newBook = new Book(16, "Fart With The Wind", "Butts", "978-0156030083");

        List<Book> result = lessonTwoService.addBook(books, newBook);

        assertEquals(books.size() + 1, result.size(), "Results do not match");
    }

    @Test
    void findDuplicateISBN() {
        List<Book> books = new ArrayList<>(testData.getBooks());
        Book newBook = new Book(16, "Fart With The Wind", "Butts", "978-0156030083");
        books.add(newBook);

        List<Book> result = lessonTwoService.findDuplicateISBN(books);

        assertEquals(books.get(8), result.get(0), "Results do not match");
        assertEquals(newBook, result.get(1), "Results do not match");
    }

    @Test
    void setIntro() {
        Book bookOne = new Book(1, "title one", "author one", "isbn one");
        Book bookTwo = new Book(2, "title two", "author two", "isbn two");
        Book bookThree = new Book(3, "title three", "author three", "isbn three");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        books.add(bookThree);

        Set<Book> result = lessonTwoService.createSet(books);

        assertEquals(books.size() - 1, result.size(), "Results do not match");
    }
}