package Day2_04_02_2024;

import java.util.ArrayList;

public class T2_ArrayList {

    public static void main(String[] args) {


        //declare an array list variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Bangladesh");
        //print out USA
        System.out.println("The first country is " + countries.get(0));
        //print out the total size of the array list
        System.out.println("The total size of the countries arraylist is " + countries.size());
        //arraylist is resizable
        countries.add("Canada");
        //print out the new size
        System.out.println("The total size of countries arraylist is " + countries.size());

    }//end of main
}//end of class
