package Action_Items;

import java.util.ArrayList;

public class AI_01 {
    public static void main (String[] args) {
        //create two string variables
        String[] videoGame;
        String[] console;
        videoGame= new String[] {"zelda"};
        console = new String[] {"gamecube"};

        int[] consoleprice = new int[]{200};
        int[] gamePrice = new int[]{50};
        System.out.println("i play " + videoGame[0] + " which costs me $" + gamePrice[0] + " on my nintendo " + console[0] + " which cost me $" + consoleprice[0]);

        //declare an array list variable
        ArrayList<String> region = new ArrayList<>();
        //add some values to region arraylist
        region.add("brooklyn");
        region.add("queens");
        region.add("new york");
        region.add("san francisco");

        //create int for area code

        int[] areaCode = new int[] {718,347,212,415};

        for (int i= 0; i < region.size(); i++) {
            System.out.println("My region is " + region.get(i) + " and my area code is " + areaCode[i]);


        }//end of for loop
    }//end of main method
}//end of public class
