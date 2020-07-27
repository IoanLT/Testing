package Test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        if(input.hasNextInt()){
            int number = input.nextInt();
            System.out.println("Thanks! You entered the number " + number);
        }
        else {
            System.out.println("You must enter a valid number");
        }
        input.close();
        

    }


}

// hasNextInt()