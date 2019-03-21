
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        String source = "src/test.bc";
        CharStream cs = fromFileName(source);
        P2Lexer lexer = new P2Lexer(cs);
        P2Parser parser = new P2Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
    }
}
