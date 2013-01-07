/*
 *    FILE: IO.java
 *    AUTHOR: David L Patrzeba
 *    E-MAIL: david.patrzeba@gmail.com
 *
 *    This file is not production code and is merely an academic exercise; that
 *    said, if you find something useful you may use this code in its entirety under the following license:
 *
 *    The MIT Liscense
 *    Copyright (c) 2012 David L Patrzeba
 *
 *    Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 *    associated documentation files (the "Software"), to deal in the Software without restriction, including
 *    without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *    copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 *    following conditions:
 *
 *    The above copyright notice and this permission notice shall be included in all
 *    copies or substantial portions of the Software.
 *
 *    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 *    LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 *    EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 *    IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
 *    THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

import java.io.Console;
import java.io.InputStreamBuffer;
import java.io.BufferedReader;
import java.io.IOException;

public class IO {

   private static BufferedReader input = 
      new BufferedReader(new InputStreamBuffer(System.in));

   private IO() {
      //should never be called
   }

   public static int readInt(Sting prompt) {

      int numberInput;

       while(true) {

         try {
            System.out.print(prompt + " ");
            numberInput = Integer.parseInt(input.readLine());
            break;
         } catch(NumberFormatException e){
            System.err.print("Not a valid integer: ");
         } catch(IOException e) {
            //should never execute
            System.err.println("Unexpected IO Error" + e);
         }
      }

   }

   public static int readHiddenInt(String prompt) {

      Console console = System.console();
      char[] chInput;
      String strInput;
      int numberInput;

      while(true) {

         chInput = console.readPassword(prompt + ": ");

         try {
            strInput = new String(chInput);
            numberInput = Integer.parseInt(strInput);
            break;
         } catch(Exception e) {
           System.err.println("Not a valid number: ");
         }

      }

      return mumberInput;

   }

}
