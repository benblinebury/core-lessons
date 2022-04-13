package lessons;

import java.util.Arrays;
import java.util.List;

class LessonTwoTestData {
    private static final Book EVERYTHING_THAT_RISES = new Book(1, "Everything That Rises Must Converge", "Flannery O'Connor", "978-0374504649");
    private static final Book UNBEARABLE = new Book(2, "The Unbearable Lightness of Being", "Milan Kundera", "978-0061148521");
    private static final Book ALAS = new Book(3, "Alas, Babylon", "Pat Frank", "978-0060741877");
    private static final Book AWAKENING = new Book(4, "The Awakening", "Kate Chopin", "978-0486277868");
    private static final Book BELL_JAR = new Book(5, "The Bell Jar", "Sylvia Plath", "978-0060837020");
    private static final Book GOOD_EARTH = new Book(6, "The Good Earth", "Pearl Buck", "978-0195810356");
    private static final Book ANARCHISM = new Book(7, "Anarchism and Other Essays", "Emma Goldman", "978-3897719200");
    private static final Book FLATLAND = new Book(8, "Flatland: A Romance of Many Dimensions", "Edwin Abbott", "979-8630248015");
    private static final Book FLOWERS = new Book(9, "Flowers for Algernon", "Daniel Keyes", "978-0156030083");
    private static final Book FIRE = new Book(10, "What Matters Most is How Well You Walk Through the Fire", "Charles Bukowski", "978-1574231052");
    private static final Book IDIOT = new Book(11, "The Idiot", "Fyodor Dostoevsky", "978-0394604343");
    private static final Book SISYPHUS = new Book(12, "Myth of Sisyphus", "Albert Camus", "978-0679733737");
    private static final Book IDENTITY = new Book(13, "Identity and Violence", "Amartya Sen", "978-0393060072");
    private static final Book CATALONIA = new Book(14, "Homage to Catalonia", "George Orwell", "978-1618952738");
    private static final Book BUILD_FIRE = new Book(15, "To Build a Fire and Other Stories", "Jack London", "978-0553213355");

    private static final List<Book> BOOKS = Arrays.asList(EVERYTHING_THAT_RISES, UNBEARABLE, ALAS, AWAKENING, BELL_JAR, GOOD_EARTH, ANARCHISM, FLATLAND, FLOWERS, FIRE, IDIOT, SISYPHUS, IDENTITY, CATALONIA, BUILD_FIRE);

    List<Book> getBooks() {
        return BOOKS;
    }
}
