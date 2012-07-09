/*
 *    FILE: NumberGuessGame.java
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGuessGame {

   public static void main(String[] args) {

      Console console = System.console();
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      int upperBound, numberToGuess, guess;

      System.out.println("\n\nWelcome to the Number Guessing Game\n" +
                         "This game is played by two players\n\n" +
                         "Player one will be prompted to input a\n" +
                         "positive integer that will act as the\n" +
                         "upper bound\n\n" +
                         "Player two will then select an integer\n" +
                         "between 0 and Player one's selection(inclusive)\n\n" +
                         "Player one will then attempt to guess\n" +
                         "the correct number.  GOOD LUCK!\n\n");

      System.out.print("Player 1, please enter the upper bound: ");

      while(true) {

         try {
            upperBound = Integer.parseInt(input.readLine());
            break;
         } catch(NumberFormatException e){
            System.err.print("Not a valid number: ");
         } catch(IOException e) {
            System.err.println("Unexpected IO Error" + e);
         }
      }

      System.out.print("Player 2, please enter a number between 0 and " + upperBound + ": ");

      while(true) {

         char[] chGuess = console.readPassword();

         try {
            String strGuess = new String(chGuess);
            numberToGuess = Integer.parseInt(strGuess);
            if( numberToGuess >= 0 && numberToGuess <= upperBound) {
               break;
            } else {
               System.out.print("Number not in Range: ");
            }
         } catch(Exception e) {
            System.err.println("Not a valid number: ");
         }

      }

      System.out.print("Player 1, please try to guess Player 2's #: ");
      guess = -1;

      while(guess != numberToGuess){
         while(true) {
             try {
               guess = Integer.parseInt(input.readLine());
               break;
             } catch(NumberFormatException e){
                System.err.print("Not a valid number: ");
             } catch(IOException e) {
                System.err.println("Unexpected IO Error" + e);
             }
          }

         if(guess < numberToGuess)
            System.out.print("Your guess is to low, guess higher: ");
         if(guess > numberToGuess)
            System.out.print("Your guess is to high, guess lower: ");
         if(guess == numberToGuess)
            System.out.println("You guessed right! GAME OVER");

      }

   }

}

