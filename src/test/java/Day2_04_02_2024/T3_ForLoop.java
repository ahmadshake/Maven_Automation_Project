package Day2_04_02_2024;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class T3_ForLoop {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Bangladesh");
        countries.add("Canada");
        //print out all the countries using a for loop
        for (int i= 0; i < countries.size(); i++){
            //print out which value the index is at
            System.out.println("The value of 'i' is " + i);
            //print out the country located at the index i
            System.out.println("My countries are " +countries.get(i));

        }//end of for loop
    }//end of main method
}//end of class
