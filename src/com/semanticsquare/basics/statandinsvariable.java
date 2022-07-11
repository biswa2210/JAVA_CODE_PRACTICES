public class statandinsvariable{
   int myVariable;
   static int data = 30;
   
   public static void main(String args[]){
      statandinsvariable obj = new statandinsvariable();
      
      System.out.println("Value of instance variable: "+obj.myVariable);
      System.out.println("Value of static variable: "+statandinsvariable.data);
   }
}