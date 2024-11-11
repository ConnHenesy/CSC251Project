public class Policy
{
   private int policyNo;
   private String provider;   
   private PolicyHolder user;
   
   //Constructors
  
   /**
   No-arg constructor
   */
   
   public Policy()
   {
      policyNo = 0;
      provider = "";
      user = new PolicyHolder();
   }
   
   /**
   Constructor that takes arguments
   @param num1 The user's policy number
   @param num2 The user's provider's name
   @param num3 A completed policyholder's profile
   */
   
   public Policy(int no, String prov, PolicyHolder u)
   {
      policyNo = no;
      provider = prov;
      user = new PolicyHolder(u);
   }
   
   
   
   //Setters
   
   /**
   Mutater for the user's policy number
   @param1 The user's policy number
   */
   
   public void setPolicyNumber(int no)
   {
      policyNo = no;
   }
   
   /**
   Mutater for the user's provider's name
   @param1 The user's provider's name
   */
   
   public void setProviderName(String prov)
   {
      provider = prov;
   }
   
   /**Mutater for the user's profile
   @param1 A completed policyholder's profile
   */
   
   public void setUser(PolicyHolder u)
   {
      user = new PolicyHolder(u);
   }
   
   //Getters
   
   /**
   Accessor for the user's policy number
   @return The user's policy number
   */
   
   public int getPolicyNumber()
   {
      return policyNo;
   }
   
   /**
   Accessor for the user's provider's name
   @return The user's provider's name
   */
   
   public String getProviderName()
   {
      return provider;
   }
   
   /**
   Accessor for the user's profile
   @return A completed policyholder's profile
   */
   
   public PolicyHolder getUser()
   {
      return new PolicyHolder(user);
   }
   
   
   /**
   toString method
   @return All of the information in a completed policy form
   */
   
   public String toString()
   {
      String str = "Policy Number: " + policyNo;
      str += "\nProvider Name: " + provider;
      str += "\n" + user;
      str += "\nPolicy Price: " + findPolicyPrice();
      return str;
   }
   
   
   /**
   Calculator for the price of the user's policy plan
   @return The price of the policyholder's policy plan
   */

   public double findPolicyPrice()
   {
      double price = 600;
      double bmi = user.findBMI();
      if (user.getAge() > 50) price += 75;
      if (user.getSmokingStatus().equals("smoker")) price += 100;
      if (bmi > 35) price += ((bmi-35)*20);
      return price;
   }
}