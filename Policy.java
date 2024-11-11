public class Policy
{   

   /**
   Calculator for the price of the user's policy plan
   @param1 The user's age
   @param2 Whether the user is a smoker ("smoker" or "non-smoker")
   @param3 The user's height
   @param4 The user's weight
   @return The total price of the user's policy plan
   */

   public double findPolicyPrice(int age, String smokingStatus, double height, double weight)
   {
      double price = 600;
      double bmi = PolicyHolder.findBMI(height, weight);
      if (age > 50) price += 75;
      if (smokingStatus.equals("smoker")) price += 100;
      if (bmi > 35) price += ((bmi-35)*20);
      return price;
   }
}