package Action_Items;

import java.util.ArrayList;

public class AI_02 {
    public static void main (String[] args) {
     //create array list string variable "countries"
       ArrayList<String> countries = new ArrayList<>();

       //add some values to countries array list
       countries.add("USA");
       countries.add("India");
       countries.add("Bangladesh");
       countries.add("UK");
       countries.add("Egypt");


       int i = 0;
       while (i==0) {
          System.out.println("my countries are " + countries.get(2) + " " + countries.get(0));

          i = i + 1;
       }//end of while loop
}//end of main
}//end of class
