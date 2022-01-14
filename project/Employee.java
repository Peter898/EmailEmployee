/*
The class that we will be using when creating a new email and password for someone
*/

import java.util.Random;

public class Employee
{
   private String firstName;
   private String lastName;
   private String email;
   private String pass;
   
   //Default constructor
   public Employee()
   {
      firstName = null;
      lastName = null;
      email = null;
      pass = null;
   }
   
   //A constructor that gets called if something is passed
   public Employee(String firstName, String lastName,String newEmail, String newPass)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = newEmail;
      this.pass = newPass;
   }
   
   public String generateEmail(String firstName, String lastName)
   {
      String email = this.firstName + this.lastName + "@company.com";
      
      return email;
   }
   
   //Create the accessors and mutators to get access to the information
   public String getEmail()
   {
      return email;
   }
   
   public String getPass()
   {
      return pass;
   }
   
   void setEmail(String newEmail)
   {
      email = newEmail;
   }
   
   void setPass(String newPass)
   {
      this.pass = newPass;
   }
   
   //These accessors and mutators are used if the employee is new
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   
   void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   void setLastName(String lastName)
   {
      this.lastName = lastName;
   }    
   
   
   
}
   


