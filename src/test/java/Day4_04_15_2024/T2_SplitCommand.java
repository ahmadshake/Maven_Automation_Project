package Day4_04_15_2024;

public class T2_SplitCommand {
    public static void main(String[] args) {
        //declare a string variable with a single message
        String message = "My name is John";

        //declare an array to store the split message
        String[] splitMessage = message.split(" ");

        //print out only John from the string
        System.out.println("The name is " + splitMessage[3]);

        //declare another message
        String triageMessage = "Automation_02";

        //declare an array to store the split message
        String[] splitMessage2 = triageMessage.split("_");

        //print out only 02 from the string
        System.out.println("The number is " + splitMessage2[1]);
    }//end of main
}//end of class
