/*
An email adminstration program.
Mimics an IT department. 

Generates a email and password for new employees.

Allows reset of password and allows employees to get the email

*/

//Import the required libraries
import java.util.Scanner;
import java.lang.Exception;

public class EmployeeTest
{

   //Display the welcome page
   public static void welcome()
   {
      System.out.println("|-------------------------------------|");
      System.out.println("|                                     |");
      System.out.println("|           Welcome to the            |");
      System.out.println("|              Companies              |");
      System.out.println("|             Email Admin             |");
      System.out.println("|                Panel                |");
      System.out.println("|                                     |");
      System.out.println("|-------------------------------------|");
   }
   
   public static void menu()
   {
      //Stores the user choice
      int choice;
      //Create the scanner object
      Scanner kb = new Scanner(System.in);
      try
      {
         System.out.println();
         System.out.println("Pick one of the following options. ");
         System.out.println("1.Add a new employee.");
         System.out.println("2.Create a email and password for a new employee. ");
         System.out.println("3.Reset a password for an employee.");
         System.out.println("0.Exit the system.");
         choice = kb.nextInt();
         useChoice(choice);
      }catch (Exception e)
      {
         System.out.println("You have entered an invalid option. Please try again later.");
      }
   }
   
   public static int useChoice(int number)
   {
      switch(number)
      {
         case 0:
            System.out.println("Exiting the system...");
            System.exit(0);
            break;
         case 1:
            addEmployee();
            break;
            
      
      }
      return number;
   }
   
   public static void addEmployee()
   {
      //Variables needed to store information
      String firstName;
      String lastName;
      //Create the scanner object
      Scanner kb = new Scanner(System.in);
      //Create the instance for the employee class
      Employee employee = new Employee();
      //Have the user enter the data
      System.out.println("Enter the employee's first name.");
      firstName = kb.nextLine();
      System.out.println("Enter the employee's last name.");
      lastName = kb.nextLine();
      
      //set the first and last name using accessors and mutators
      employee.setFirstName(firstName);
      employee.setLastName(lastName);
      
      System.out.println("Employee has been added.");  
   }
   
   public static void main(String[]args)
   {
      //Displays the welcome page
      welcome();    
      menu();
     
   
   }

}