package net.phatcode.rel.main; /********************************************************************
 *  net.phatcode.rel.main.Interpreter.java
 *  A Virtual Manager
 *
 *  Richard Eric Lope BSN RN
 *  http://rel.phatcode.net
 *  Started: March 06, 2016
 *  Ended: Ongoing
 *
 * License MIT: 
 * Copyright (c) 2016 Richard Eric M. Lope 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software. (As clarification, there is no
 * requirement that the copyright notice and permission be included in binary
 * distributions of the Software.)
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 *
 *******************************************************************/

import net.phatcode.rel.parselets.Statement;

import java.util.List;


class Interpreter {

    private Parser parser = new Parser();
    private Lexer lexer = new Lexer();
    private String source = "";


    Interpreter() {
    }

    Interpreter( String source ) {
        this.source = source;

    }

    void printTokens( List<Token> tokens ) {
        for ( Token token : tokens ) {
            System.out.println( token.toString() );
        }

    }

    void run( String fileName, boolean debug ) {
        SourceReader sourceReader = new SourceReader( fileName );

        source = sourceReader.getSource();

        List<Token> tokens = lexer.tokenize( source );

        parser.setTokens( tokens );
        parser.parse();

        List<Statement> statements = parser.getStatements();

        for ( Statement statement : statements )
            statement.execute();
    }
}
