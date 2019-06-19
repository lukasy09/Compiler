import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) {
        Translator translator = new Translator();

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName("src/main/resources/test");

        } catch (Exception e) {
            System.err.println("Error");
        }

        JavaDogLexer jdLexer = new JavaDogLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(jdLexer);
        JavaDogParser jdParser = new JavaDogParser(commonTokenStream);

        JavaDogParser.RootContext rootContext = jdParser.root();

        String result = translator.visit(rootContext);

        System.out.println(result);

    }
}
