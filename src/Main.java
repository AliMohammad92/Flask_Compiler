import gen.ANTLR.PythonLexer;
import gen.ANTLR.PythonParser;
import gen.ANTLR.BaseVisitor;   // الـ visitor الخاص بك
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PythonLexer lexer = new PythonLexer(CharStreams.fromFileName("C:\\Users\\Ali\\IdeaProjects\\Flask_Compiler\\src\\test.py"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PythonParser parser = new PythonParser(tokens);

        ParseTree tree = parser.program();

        BaseVisitor visitor = new BaseVisitor();
        visitor.visit(tree);
    }
}