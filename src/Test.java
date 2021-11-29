import gen.*;
import org.antlr.v4.runtime.*;
import java.io.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test {
    public static void main(String[] args) {
        try {
            File dir = new File(args[1]);
            PrintStream out = new PrintStream(dir);
            System.setOut(out);
            System.out.println("""
                    declare i32 @getint()
                    declare void @putint(i32)
                    declare void @putch(i32)
                    declare i32 @getch()
                    declare void @memset(i32*, i32, i32)""");
            //create lexer and parse and reallocate Error listeners
            CharStream input = CharStreams.fromFileName(args[0]);
            grammerLexer lexer = new grammerLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new lexerErrorListener());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            grammerParser parser = new grammerParser(tokens);
            parser.removeParseListeners();
            parser.addErrorListener(new parserErrorListener());
            grammerParser.CompUnitContext tree = parser.compUnit();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(new myListener(), tree);
            System.out.println();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
