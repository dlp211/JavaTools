////////////////////////////////////////////
//    ToolsTest.java
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
////////////////////////////////////////////

public class ToolsTest{

   public static void main(String[] args){

      //test insertion sorts
      int[] array = {8, 10, 5, 87, 56, 12, 54, 23, 100, 1, 7, 99};
      array = DavesTools.insertionSort(array);
      for(int x : array){
         System.out.printf("%d\n",x);
      }

      array = DavesTools.insertionSortD(array);
      for(int x : array){
         System.out.printf("%d\n",x);
      }
      //end insertion sort tests
      //

   }//end of method main
}//end class ToolsTest
