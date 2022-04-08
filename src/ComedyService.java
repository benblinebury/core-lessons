import java.util.*;

public class ComedyService {

    void getJoke() {
        Random random = new Random();

        int jokeId = random.nextInt(5) + 1;

        List<Joke> jokes = getJokes();

        Joke theJoke = new Joke();

        for (Joke joke : jokes) {
            if (joke.getId() == jokeId) {
                theJoke = joke;
            }
        }

//        for (int i = 0; i < jokes.size(); i++) {
//            if (jokes.get(i).getId() == jokeId) {
//                theJoke = jokes.get(i);
//            }
//        }

        System.out.println(theJoke.getMessage());
    }

    private List<Joke> getJokes() {
        Joke jokeOne = new Joke(1, "I'm afraid for the calendar. Its days are numbered.");
        Joke jokeTwo = new Joke(2, "My wife said I should do lunges to stay in shape. That would be a big step forward.");
        Joke jokeThree = new Joke(3, "Singing in the shower is fun until you get soap in your mouth. Then it's a soap opera.");
        Joke jokeFour = new Joke(4, "How do you follow Will Smith in the snow? You follow the fresh prints.");
        Joke jokeFive = new Joke(5, "Dear Math, grow up and solve your own problems.");

        return Arrays.asList(jokeOne, jokeTwo, jokeThree, jokeFour, jokeFive);
    }

    public void hello() {
        System.out.println("Hi");
    }
}
