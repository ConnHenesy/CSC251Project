public class Policy
{
   private int policyNo;
   private String provider;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   
   //Constructors 
   
   /**
   No-arg constructor
   */
   
   public Policy()
   {
      policyNo = 0;
      provider = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   
   /**
   Constructor that takes arguments
   @param num1 The user's policy number
   @param num2 The user's provider's name
   @param num3 The user's first name
   @param num4 The user's surname
   @param num5 The user's age
   @param num6 Whether the user is a smoker ("smoker" or "non-smoker")
   @param num7 The user's height, in inches
   @param num8 The user's weight, in pounds
   */
   
   public Policy(int no, String prov, String first, String last, int a, String smoke, double h, double w)
   {
      policyNo = no;
      provider = prov;
      firstName = first;
      lastName = last;
      age = a;
      smokingStatus = smoke;
      height = h;
      weight = w;
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
   
   /**
   Mutater for the user's first name
   @param1 The user's first name
   */
   
   public void setFirstName(String first)
   {
      firstName = first;
   }
   
   /**
   Mutater for the user's last name
   @param1 The user's surname
   */

   public void setLastName(String last)
   {
      lastName = last;
   }
   
   /**
   Mutater for the user's age
   @param1 The user's age
   */

   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   Mutater for the user's smoking status
   @param1 Whether the user is a smoker ("smoker" or "non-smoker")
   */

   public void setSmokingStatus(String smoke)
   {
      smokingStatus = smoke;
   }
   
   /**
   Mutater for the user's height
   @param1 The user's height, in inches
   */

   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
   Mutater for the user's weight
   @param1 The user's weight, in pounds
   */

   public void setWeight(double w)
   {
      weight = w;
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
   Accessor for the user's first name
   @return The user's first name
   */
   
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
   Accessor for the user's last name
   @return The user's surname
   */
   
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   Accessor for the user's age
   @return The user's age
   */

   public int getAge()
   {
      return age;
   }
   
   /**
   Accessor for the user's smoking status
   @return Whether the user is a smoker ("smoker" or "non-smoker")
   */

   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   Accessor for the user's height
   @return The user's height, in inches
   */

   public double getHeight()
   {
      return height;
   }
   
   /**
   Accessor for the user's weight
   @return The user's weight, in pounds
   */

   public double getWeight()
   {
      return weight;
   }
   
   
   //Calculators
   
   /**
   Calculator for the user's body mass index (BMI)
   @param1 The user's height
   @param2 The user's weight
   @return The user's BMI
   */
   
   public double findBMI(double height, double weight)
   {
      return ((weight*703)/(Math.pow(height,2)));
   }
   
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
      double bmi = findBMI(height, weight);
      if (age > 50) price += 75;
      if (smokingStatus.equals("smoker")) price += 100;
      if (bmi > 35) price += ((bmi-35)*20);
      return price;
   }
}