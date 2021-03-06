package lessons;

import java.util.*;

class LessonTwoTestData {
    public static final Book EVERYTHING_THAT_RISES = new Book(1, "Everything That Rises Must Converge", "Flannery O'Connor", "978-0374504649");
    public static final Book UNBEARABLE = new Book(2, "The Unbearable Lightness of Being", "Milan Kundera", "978-0061148521");
    public static final Book ALAS = new Book(3, "Alas, Babylon", "Pat Frank", "978-0060741877");
    public static final Book AWAKENING = new Book(4, "The Awakening", "Kate Chopin", "978-0486277868");
    public static final Book BELL_JAR = new Book(5, "The Bell Jar", "Sylvia Plath", "978-0060837020");
    public static final Book GOOD_EARTH = new Book(6, "The Good Earth", "Pearl Buck", "978-0195810356");
    public static final Book ANARCHISM = new Book(7, "Anarchism and Other Essays", "Emma Goldman", "978-3897719200");
    public static final Book FLATLAND = new Book(8, "Flatland: A Romance of Many Dimensions", "Edwin Abbott", "979-8630248015");
    public static final Book FLOWERS = new Book(9, "Flowers for Algernon", "Daniel Keyes", "978-0156030083");
    public static final Book FIRE = new Book(10, "What Matters Most is How Well You Walk Through the Fire", "Charles Bukowski", "978-1574231052");
    public static final Book IDIOT = new Book(11, "The Idiot", "Fyodor Dostoevsky", "978-0394604343");
    public static final Book SISYPHUS = new Book(12, "Myth of Sisyphus", "Albert Camus", "978-0679733737");
    public static final Book IDENTITY = new Book(13, "Identity and Violence", "Amartya Sen", "978-0393060072");
    public static final Book CATALONIA = new Book(14, "Homage to Catalonia", "George Orwell", "978-1618952738");
    public static final Book BUILD_FIRE = new Book(15, "To Build a Fire and Other Stories", "Jack London", "978-0553213355");

    public static final List<Book> BOOKS = Arrays.asList(EVERYTHING_THAT_RISES, UNBEARABLE, ALAS, AWAKENING, BELL_JAR, GOOD_EARTH, ANARCHISM, FLATLAND, FLOWERS, FIRE, IDIOT, SISYPHUS, IDENTITY, CATALONIA, BUILD_FIRE);

    List<Book> getBooks() {
        return BOOKS;
    }

    List<Book> getBooksForSet() {
        Book bookOne = new Book(1, "title one", "author one", "isbn one");
        Book bookTwo = new Book(2, "title two", "author two", "isbn two");
        Book bookThree = new Book(3, "title three", "author three", "isbn three");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        books.add(bookThree);

        return books;
    }

    Set<Book> getBookSet() {
        List<Book> books = getBooksForSet();

        return new HashSet<>(books);
    }
}
