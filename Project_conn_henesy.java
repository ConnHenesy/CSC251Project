import java.util.Scanner;
import java.io.*;

public class Project_conn_henesy
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      int totalSmokers = 0;
      int totalNonSmokers = 0;
      
      while (inputFile.hasNext())
      {
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
         if (inputFile.hasNext())
         {
            inputFile.nextLine();
         }
   
   
   
         PolicyHolder user = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         Policy policy = new Policy(policyNo, provider, user);
         
         System.out.print("\n\n\n" + policy);
         
         if (user.getSmokingStatus().equals("smoker"))
         {
            totalSmokers += 1;
         }
         else
         {
            totalNonSmokers += 1;
         }
      }
      System.out.println("\n\n\nThere were " + Policy.getPolicyCount() + " Policy objects created.\n");
      System.out.println("The number of policies with a smoker is: " + totalSmokers);
      System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
   }
}