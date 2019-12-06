import java.util.Scanner;

public class whatDay
{
    public static void main(String[] args) {
        int age;
        Scanner keyboard = new Scanner(System.in);
        String Days;
        System.out.println("Age: ");
        age = keyboard.nextInt();
        System.out.println("Day: ");
        Days = keyboard.nextLine();


        if (age < 18 && Days.equals("Monday")) {
            System.out.println("School day today!!!");
        }//ends if statement
        else if (age >= 18 && Days.equals("Monday")) {
            System.out.println("Work day today!!!");
        }//ends else if statement
        else {
            System.out.println("Celebrate");
        }//ends else statement

        if (age < 18 && Days.equals("Tuesday")) {
            System.out.println("School day today!!!");
        } else (age >= 18 && Days.equals("Tuesday"))
        {
            System.out.println("Work day today!!!");
        }

        if (age < 18 && Days.equals("Wednesday")) {
            System.out.println("School day today!!!");
        } else (age >= 18 && Days.equals("Wednesday"))
        {
            System.out.println("Work day today!!!");
        }

        if (age < 18 && Days.equals("Thursday")) {
            System.out.println("School day today!!!");
        } else (age >= 18 && Days.equals("Thursday"))
        {
            System.out.println("Work day today!!!");
        }

        if (age < 18 && Days.equals("Friday"))
        {
            System.out.println("School day today!!!");
        }
        else (age >= 18 && Days.equals("Friday"))
        {
            System.out.println ("Work day today!!!");
        }

    }//end main method
}//end main class
