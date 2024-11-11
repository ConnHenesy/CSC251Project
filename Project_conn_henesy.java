import java.util.Scanner;
import java.io.*;

public class Project_conn_henesy
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      int policyNo = inputFile.nextInt();
      inputFile.nextLine();
            
      String provider = inputFile.nextLine();
      
      String firstName = inputFile.nextLine();
      
      String lastName = inputFile.nextLine();
      
      int age = inputFile.nextInt();
      inputFile.nextLine();
      
      String smokingStatus = inputFile.nextLine();
      
      double height = inputFile.nextDouble();
      inputFile.nextLine();
      
      double weight = inputFile.nextDouble();
      inputFile.nextLine();



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