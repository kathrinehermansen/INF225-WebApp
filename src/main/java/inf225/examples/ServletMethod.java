package inf225.examples;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import inf225.grammars.*;

public class ServletMethod {
	
	public String equate(String userInput) {
		
		ANTLRInputStream input = new ANTLRInputStream(userInput);
		
		KathrineGrammarLexer lexer = new KathrineGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		KathrineGrammarParser parser = new KathrineGrammarParser(tokens);
		ParseTree tree = parser.program(); // parse; start at prog

		PrintParseTree prettyTree = new PrintParseTree();
		KathrineEvalVisitor eval = new KathrineEvalVisitor();

		System.out.println("Inserted math equations:");
		System.out.println(userInput);
		System.out.println("The results are:");
		eval.visit(tree);
		System.out.println();
		System.out.println("Parse tree");

		System.out.println();
		prettyTree.visit(tree);
		
		return eval.visit(tree).toString();
		
	}
}