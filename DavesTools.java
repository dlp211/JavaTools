/*///////////////////////////////////////////
//    DavesTools.java
//
//    This file is liscensed under BSD
//    Author: David L Patrzeba
//    E-Mail: david.patrzeba@gmail.com
//
//    This file is not production code and
//    is merely an academic exercise in
//    building and testing algorithms; that
//    said, if you find something useful
//    you may use this code in its entirety
*////////////////////////////////////////////

public class DavesTools{

   //First algorithm, insertion sort, runtime cn^2
   //ascending
   //TODO: make method take any type array
   public static int[] insertionSort(int[] array){

      for(int i = 1; i < array.length; ++i){
         int key = array[i];
         int j = i - 1;

         while(j > -1 && array[j] >  key){
            array[j+1] = array[j];
            --j;
         }//end while loop

         array[j+1] = key;

      }//end for loop

      return array;
   }//end method insertionSort

   public static int[] insertionSortD(int[] array){

      for(int i = 1; i < array.length; ++i){
         int key = array[i];
         int j = i - 1;

         while(j > -1 && array[j] <  key){
            array[j+1] = array[j];
            --j;
         }//end while loop

         array[j+1] = key;

      }//end for loop

      return array;

   }//end method insertionSortD




}//end of class DavesTools

