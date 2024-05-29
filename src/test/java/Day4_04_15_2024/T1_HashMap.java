package Day4_04_15_2024;

import java.util.HashMap;

public class T1_HashMap{

    public static void main(String[] args) {
        //create a hashmap consisting of name and age of Triage Students
        HashMap<String, Integer> triageStudents = new HashMap();

        //add some values for the triageStudents HashMap
        triageStudents.put("Oyon", 25);
        triageStudents.put("Shakeb", 29);
        triageStudents.put("Tanvir", 27);
        triageStudents.put("Angie", 21);

        //print out the size of the hashmap
        System.out.println("The size of the HashMap is " + triageStudents.size());
        //print out the content of the HashMap
        System.out.println(triageStudents);
        //print out Oyon's age
        int oyonsAGE = triageStudents.get("Oyon");
        System.out.println("Oyon's age is " + oyonsAGE);
        //print out Noyons age only if it exists in the data set
        if(triageStudents.containsKey("Noyon")){
            System.out.println("Noyon's age is " + triageStudents.get("Noyon"));
        }else {
            System.out.println("Noyon does not exist in the data set");


        }//end of if else
    }//end of main
}//end of class
