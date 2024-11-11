public class PolicyHolder
{
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
   
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
   Constructor that takes arguments
   @param num1 The user's first name
   @param num2 The user's surname
   @param num3 The user's age
   @param num4 Whether the user is a smoker ("smoker" or "non-smoker")
   @param num5 The user's height, in inches
   @param num6 The user's weight, in pounds
   */
   
   public PolicyHolder(String first, String last, int a, String smoke, double h, double w)
   {
      firstName = first;
      lastName = last;
      age = a;
      smokingStatus = smoke;
      height = h;
      weight = w;
   }
   
   /**
   Copy constructor
   @param1 A completed PolicyHolder object
   */
   
   public PolicyHolder(PolicyHolder user)
   {
      firstName = user.firstName;
      lastName = user.lastName;
      age = user.age;
      smokingStatus = user.smokingStatus;
      height = user.height;
      weight = user.weight;
   }
   
   
   
   
   //Setters
   
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
   
   
   /**
   toString method
   @return A string containing all of the information in a completed policyholder's profile
   */
   public String toString()
   {
      String str = "Policyholder's First Name: " + firstName;
      str += "\nPolicyholder's Last Name: " + lastName;
      str += "\nPolicyholder's Age: " + age;
      str += "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus;
      str += "\nPolicyholder's Height: " + height;
      str += "\nPolicyholder's Weight: " + weight;
      str += "\nPolicyholder's BMI: " + findBMI();
      return str;
   }
   
   //Calculators
   
   /**
   Calculator for the user's body mass index (BMI)
   @return The user's BMI
   */
   
   public double findBMI()
   {
      return ((weight*703)/(Math.pow(height,2)));
   }

}