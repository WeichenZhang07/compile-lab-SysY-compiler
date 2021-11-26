import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.Interval;

public class lexerErrorListener extends BaseErrorListener {
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        Lexer lexer = (Lexer) recognizer;
        String context = lexer._input.getText(Interval.of(lexer._tokenStartCharIndex, lexer._input.index()));
        String miss = lexer.getErrorDisplay(context);

        System.err.println("[LEXER] LINE" + line + "COL" + charPositionInLine + "MIS: " + miss);
        System.exit(2);

    }

}
