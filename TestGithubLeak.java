import java.util.Arrays;
import java.util.List;


public class TestGithubLeak {
    private static final String SECRET_SSSSSH = "b3BlbnNzaC1rZXktdjEAAAAABG5vbmUAAAAEbm9uZQAAAAAAAAABAAABFwAAAAdzc2gtcn\n" +
            "NhAAAAAwEAAQAAAQEAxF11BLDlWLa746/1ScuqfqloLDIOwFLRT2I8M9ftrUok3SLmAuq/\n" +
            "5XE68TChbtd783UeV1yC2Q+8bhj1yLYGUav9WgZN7OJrrcOHdQ5D0yjG4jsrC4GbdUpmJ7\n" +
            "01Hxqc5YGGqbpQ3CEtB0IXO/b5m1ulr1KUsY6/KLwHvfzLFC5e7v1lL9ZzVwkA3Ylm24ns\n" +
            "9BUB9IWHzTJJmquiuk3VNLHbC6fomrYorJTAnzLb5BtTrtsXpJAJG1q8H0i6nbGatSP7Do\n" +
            "uEWFM/PjeO8/lhZf92HRmlq33e2a0w6Wsxfa/UTU3R6tUqPAnzeEF8KGZD+DqxpCYZTySg\n" +
            "+e+Q8Bd0dwAAA8jK0A8rytAPKwAAAAdzc2gtcnNhAAABAQDEXXUEsOVYtrvjr/VJy6p+qW\n" +
            "gsMg7AUtFPYjwz1+2tSiTdIuYC6r/lcTrxMKFu13vzdR5XXILZD7xuGPXItgZRq/1aBk3s\n" +
            "4mutw4d1DkPTKMbiOysLgZt1SmYnvTUfGpzlgYapulDcIS0HQhc79vmbW6WvUpSxjr8ovA\n" +
            "e9/MsULl7u/WUv1nNXCQDdiWbbiez0FQH0hYfNMkmaq6K6TdU0sdsLp+iatiislMCfMtvk\n" +
            "G1Ou2xekkAkbWrwfSLqdsZq1I/sOi4RYUz8+N47z+WFl/3YdGaWrfd7ZrTDpazF9r9RNTd\n" +
            "Hq1So8CfN4QXwoZkP4OrGkJhlPJKD575DwF3R3AAAAAwEAAQAAAQAzwprE2MgroUdXlhsn\n" +
            "D5tqdccy1yMSSQJJVZCe7c0Fv6SF8dwFatGYbkdmKjZzXDOdEgMkbgtDoiU+NDAdbvWtc5\n" +
            "N9tmm2Blzx2beMAG2abIY4PfZzuv86ZJkW4oXtI/u1d3YCqU0FKW2QGzi6orha3kaHN1Jg\n" +
            "l0sGNsInr0nskHI6aFK0UmhdqyQKr1Whd0tLDERTqmF9AjiFEVHlHnOiIlwzPuwDT25z4V\n" +
            "YXshj0b4ka1Tw36GAaEBa7/wYwcp77i/R4UyeovJN4B1LzEw7wk33SzH36k0tC1da9lufr\n" +
            "0ApeMv6Ah1egqm6H8u/KsKsSK3zlGQjwLdovOiDwKv6hAAAAgQCUQldtuZM7re7RJUIh91\n" +
            "0EG5hTy3iv+iu/zk5JxDwoQ8KHlAe1sxob7m+2uoiIv0QXyhBeH7aF8+GvELHuEcQqN/su\n" +
            "LkTPRbpUjlS2WDFQu0SRM5iSCufh0wlW4P3MHvZtqZMotb4C9rYpiDRehXHa/Clwh7FXWa\n" +
            "k3RcUUCEII2AAAAIEA6xQIe4w9BlcwhuHcxj2GxlFGSyCO9qM2jsQXIQfKhhKaq720dHj4\n" +
            "KW1jXeRktpRNg5jDRO1qqNFTki3ahQjTfk9Z1mYziHXAbFoLs7NQuDni0vnyBUghVhfZpr\n" +
            "x87fvrnrjppWXjtdaMCl20fIlxqUcndnPGbvrG7HsrGLHuHEcAAACBANXXZFX40oN6lbDr\n" +
            "i6pAqvsXpdZoks11CBTFZG8bj3bmIfBBSy3MAdASsbv8FKFtuzT0WEzd/i3xMw+fg5r3ga\n" +
            "IjNVRbK94hQT3Yu+nMjRFEYRDiH7dmtN+Qxgu7iklVwRg4LnWGeMuTvcr0vYUlhVxdbYXl\n" +
            "8DmkVUC2XTUulm5RAAAAEmthdmVlbkBuZWV2YWstc2FtYQ==";
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

