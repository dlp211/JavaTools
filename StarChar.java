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

import java.util.Scanner;
import java.util.ArrayList;

public class StarChar {

   public void getString(String str){

      String working = str.toUpperCase();
      Scanner input = new Scanner(working);
      ArrayList<char[][]> list = new ArrayList<char[][]>();

      while(input.hasNext()){

         while(list.size() < 8 && input.hasNext()){

            String word = input.next();

            for(int i = 0; i < word.length(); ++i){
               list.add(starList[(int) word.charAt(i) - 'A']);

            }
            list.add(starList[26]);
         }

         for(int i = 0; i < 5; ++i){

            for(char[][] array : list){
               System.out.print(array[i]);
            }
            System.out.println();
         }
         System.out.println();
         System.out.println();
         list.clear();
      }




   }//End getString

   public char[][][] starList = {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,SPACE};

   private static final char[][] A = {{' ',' ','*',' ',' ',' '},
                                      {' ','*',' ','*',' ',' '},
                                      {'*','*','*','*','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '}};

   private static final char[][] B = {{'*','*','*','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*','*','*','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*','*','*','*',' ',' '}};

   private static final char[][] C = {{' ','*','*','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {' ','*','*','*',' ',' '}};

   private static final char[][] D = {{'*','*','*','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*','*','*','*',' ',' '}};

   private static final char[][] E = {{'*','*','*','*','*',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*','*','*',' ',' ',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*','*','*','*','*',' '}};

   private static final char[][] F = {{'*','*','*','*','*',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*','*','*',' ',' ',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*',' ',' ',' ',' ',' '}};

   private static final char[][] G = {{'*','*','*','*','*',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*',' ','*','*','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*','*','*','*','*',' '}};

   private static final char[][] H = {{'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*','*','*','*','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '}};

   private static final char[][] I = {{'*','*','*','*','*',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {'*','*','*','*','*',' '}};

   private static final char[][] J = {{'*','*','*','*','*',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {'*',' ','*',' ',' ',' '},
                                      {' ','*','*',' ',' ',' '}};

   private static final char[][] K = {{'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ','*',' ',' '},
                                      {'*','*','*',' ',' ',' '},
                                      {'*',' ',' ','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '}};

   private static final char[][] L = {{'*',' ',' ',' ',' ',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*','*','*','*','*',' '}};

   private static final char[][] M = {{'*',' ',' ',' ','*',' '},
                                      {'*','*',' ','*','*',' '},
                                      {'*',' ','*',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '}};

   private static final char[][] N = {{'*',' ',' ',' ','*',' '},
                                      {'*','*',' ',' ','*',' '},
                                      {'*',' ','*',' ','*',' '},
                                      {'*',' ',' ','*','*',' '},
                                      {'*',' ',' ',' ','*',' '}};

   private static final char[][] O = {{' ','*','*','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {' ','*','*','*',' ',' '}};

   private static final char[][] P = {{'*','*','*','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*','*','*','*',' ',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {'*',' ',' ',' ',' ',' '}};

   private static final char[][] Q = {{' ','*','*','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ','*','*',' '},
                                      {' ','*','*',' ','*',' '}};

   private static final char[][] R = {{'*','*','*','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*','*','*','*',' ',' '},
                                      {'*',' ',' ','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '}};

   private static final char[][] S = {{' ','*','*','*',' ',' '},
                                      {'*',' ',' ',' ',' ',' '},
                                      {' ','*','*','*',' ',' '},
                                      {' ',' ',' ',' ','*',' '},
                                      {' ','*','*','*',' ',' '}};

   private static final char[][] T = {{'*','*','*','*','*',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ',' ','*',' ',' ',' '}};

   private static final char[][] U = {{'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {' ','*','*','*',' ',' '}};

   private static final char[][] V = {{'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {' ','*',' ','*',' ',' '},
                                      {' ','*',' ','*',' ',' '},
                                      {' ',' ','*',' ',' ',' '}};

   private static final char[][] W = {{'*',' ',' ',' ','*',' '},
                                      {'*',' ',' ',' ','*',' '},
                                      {'*',' ','*',' ','*',' '},
                                      {'*','*',' ','*','*',' '},
                                      {'*',' ',' ',' ','*',' '}};

   private static final char[][] X = {{'*',' ',' ',' ','*',' '},
                                      {' ','*',' ','*',' ',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ','*',' ','*',' ',' '},
                                      {'*',' ',' ',' ','*',' '}};

   private static final char[][] Y = {{'*',' ',' ',' ','*',' '},
                                      {' ','*',' ','*',' ',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ',' ','*',' ',' ',' '}};

   private static final char[][] Z = {{'*','*','*','*','*',' '},
                                      {' ',' ',' ','*',' ',' '},
                                      {' ',' ','*',' ',' ',' '},
                                      {' ','*',' ',' ',' ',' '},
                                      {'*','*','*','*','*',' '}};

   private static final char[][] SPACE = {{' ',' ',' '},
                                          {' ',' ',' '},
                                          {' ',' ',' '},
                                          {' ',' ',' '},
                                          {' ',' ',' '}};







}//End StarChar
