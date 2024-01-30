import java.util.Arrays;
import java.util.List;


public class TestGithubLeak {
    private static final List<String> jokes = Arrays.asList(
            "Why don't scientists trust atoms? Because they make up everything!",
            "Why don't some fish play piano? Because you can't tuna fish!",
            "What did the buffalo say when his kid went to college? Bison.",
            "What did the mayonnaise say when the refrigerator door was opened? Close the door, I'm dressing. ",
            "What did one wall say to the other? I'll meet you at the corner.",
            "Why don't sharks eat clowns? Because they taste funny."
    );

    public static void main(String[] args) {
        jokes.stream()
             .map(joke -> joke.replaceAll("Why", "Y") + " Ha ha!")
             .forEach(System.out::println);

        System.out.println("Author of these jokes: Kaveen");
    }
}

