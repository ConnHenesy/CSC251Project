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
   
   
   public void setPolicyNumber(int no)
   {
      policyNo = no;
   }
   
   public void setProviderName(String prov)
   {
      provider = prov;
   }
   
   public void setFirstName(String first)
   {
      firstName = first;
   }
   
   public void setLastName(String last)
   {
      lastName = last;
   }
   
   public void setAge(int a)
   {
      age = a;
   }
   
   public void setSmokingStatus(String smoke)
   {
      smokingStatus = smoke;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   public void setWeight(double w)
   {
      weight = w;
   }
   
   
   //Getters


   public int getPolicyNumber()
   {
      return policyNo;
   }
   
   public String getProvderName()
   {
      return provider;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   
   //Calculators
   
   
   public double findBMI(double height, double weight)
   {
      return ((weight*703)/(Math.pow(height,2)));
   }
   
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