package lessons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static lessons.LessonTwoTestData.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void arrays() {
        Book[] result = lessonTwoService.createArray(EVERYTHING_THAT_RISES, AWAKENING, UNBEARABLE, IDENTITY);

        assertEquals(4, result.length, "Results do not match");
    }

    @Test
    void addBookToList() {
        Book newBook = new Book(16, "Fart With The Wind", "Butts", "978-0156030083");

        List<Book> result = lessonTwoService.addBook(books, newBook);

        assertEquals(books.size() + 1, result.size(), "Results do not match");
    }

    @Test
    void findDuplicateISBN() {
        List<Book> books = testData.getBooks();
        Book newBook = new Book(16, "Fart With The Wind", "Butts", "978-0156030083");
        books.add(newBook);

        List<Book> result = lessonTwoService.findDuplicateISBN(books);

        assertEquals(FLOWERS, result.get(0), "Results do not match");
        assertEquals(newBook, result.get(1), "Results do not match");
    }

    @Test
    void setIntro() {
        books = testData.getBooksForSet();
        Set<Book> bookSet = testData.getBookSet();

        Set<Book> result = lessonTwoService.createSet(books);

        assertEquals(bookSet.size(), result.size(), "Results do not match");
    }
}