import javax.swing.JOptionPane;

public class Email
{
   public static void main(String args[])
   {
      //Create the variables to store information
      String firstName;
      String lastName;
      String fullName;
      String email;
      String pass;
      //Create an object using the Employee class
      Employee employee = new Employee();
      
      //Using JOptionPane, have the user enter the information
      firstName = JOptionPane.showInputDialog(null,"Enter the first name of the person");
      lastName = JOptionPane.showInputDialog(null,"Enter the last name of the person"); 
      fullName = firstName + " " + lastName;    
      
      //Set the first and last name of th person
      employee.setFirstName(firstName);
      employee.setLastName(lastName);
      
      //Generate an email using the first and last name, then set it
      email = employee.generateEmail(firstName,lastName);
      employee.setEmail(email);
      
      //Let the user set the password for the employee
      pass = JOptionPane.showInputDialog(null,"Enter the password for " + fullName);
      //Set the password 
      employee.setPass(pass);
      
      //Display all this information in a message box
      if (firstName == null || lastName == null || email == null)
      {
         JOptionPane.showMessageDialog(null,"Employee information is missing.");
      }
      else
      {
         JOptionPane.showMessageDialog(null,"The email for " + fullName + " is: "+ employee.getEmail() +" \nand their password is: "+
                                 employee.getPass());
      }

      
   }
}