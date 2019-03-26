package net.phatcode.rel.main;

/********************************************************************
 *  net.phatcode.rel.main.AnyaBasicMain.java
 *  Entry point/main class
 *
 *  Richard Eric Lope BSN RN
 *  http://rel.phatcode.net
 *  Started: March 06, 2016
 *  Ended: Ongoing
 *
 * License MIT: 
 * Copyright (c) 2016 Richard Eric Lope 
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


public class AnyaBasicMain {

    public static void main( String[] args ) {
        if ( args.length < 1 ) {
            System.out.println( "Usage: AnyaBASIC.jar net.phatcode.rel.main.AnyaBasicMain <source.abs> <debug>" );
            System.exit( 1 );
        }

        boolean debug = false;
        if ( args.length > 1 ) {
            if ( args[1].equals( "debug" ) ) debug = true;
        }
        net.phatcode.rel.main.Interpreter interpreter = new net.phatcode.rel.main.Interpreter();
        interpreter.run( args[0], debug );
    }
}
