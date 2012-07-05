/*
 *    FILE: StarChar.java
 *    AUTHOR: David L Patrzeba
 *    E-MAIL: david.patrzeba@gmail.com
 *
 *    This file is designed to take in a string and output to the console the string represented as characters
 *    made out of the asteriks '*'.  This code may be used under the following liscense:
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


public class StarChar {

   public static void main(String[] args){
      for(char[] row : D){
         for(char col : row){
            System.out.print(col);
         }
         System.out.println();
      }
   }


   public static void getString(String str){



   }//End getString

   private static final char[][] A = {{' ',' ','*',' ',' '},
                                      {' ','*',' ','*',' '},
                                      {'*','*','*','*','*'},
                                      {'*',' ',' ',' ','*'},
                                      {'*',' ',' ',' ','*'}};

   private static final char[][] B = {{'*','*','*','*',' '},
                                      {'*',' ',' ',' ','*'},
                                      {'*','*','*','*',' '},
                                      {'*',' ',' ',' ','*'},
                                      {'*','*','*','*',' '}};

   private static final char[][] C = {{' ','*','*','*',' '},
                                      {'*',' ',' ',' ','*'},
                                      {'*',' ',' ',' ',' '},
                                      {'*',' ',' ',' ','*'},
                                      {' ','*','*','*',' '}};

   private static final char[][] D = {{'*','*','*','*',' '},
                                      {'*',' ',' ',' ','*'},
                                      {'*',' ',' ',' ','*'},
                                      {'*',' ',' ',' ','*'},
                                      {'*','*','*','*',' '}};


}//End StarChar
