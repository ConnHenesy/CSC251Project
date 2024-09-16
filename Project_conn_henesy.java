import java.util.Scanner;

public class Project_conn_henesy
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      int policyNo = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      String provider = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      String firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      int age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = keyboard.nextLine();
      while (!(smokingStatus.equals("smoker")) && !(smokingStatus.equals("non-smoker")))
      {
         System.out.print("Invalid selection. Please enter \"smoker\" or \"non-smoker\": ");
         smokingStatus = keyboard.nextLine();
      }
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double weight = keyboard.nextDouble();



      Policy user = new Policy(policyNo, provider, firstName, lastName, age, smokingStatus, height, weight);
      
      System.out.print("\n\n\n\n");
      System.out.printf("Policy Number: %d\n",user.getPolicyNumber());
      System.out.printf("Provider Name: %s\n",user.getProviderName());
      System.out.printf("Policyholder's First Name: %s\n",user.getFirstName());
      System.out.printf("Policyholder's Last Name: %s\n",user.getLastName());
      System.out.printf("Policyholder's Age: %d\n",user.getAge());
      System.out.printf("Policyholder's Smoking Status: %s\n",user.getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f\n",user.getHeight());
      System.out.printf("Policyholder's Weight: %.1f\n",user.getWeight());
      System.out.printf("Policyholder's BMI: %.2f\n",user.findBMI(height, weight));
      System.out.printf("Policy Price: $%.2f\n",user.findPolicyPrice(age, smokingStatus, height, weight));
   }
}