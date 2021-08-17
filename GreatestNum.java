//Activity 14
import java.util.*;
public class GreatestNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int num1=43,num2=91,num3=183;
	    
	      int x=Math.abs(num1-num2);
	      int y=Math.abs(num3-num2);
	      int z=Math.abs(num3-num1);
	      int gcdNumbers = GreatestNum.findGCD(x, y, z);
	      System.out.println("The greatest number that will divide 43, 91 and 183 and leaves the same remainder is: "+gcdNumbers);
	      sc.close();
	   }
	   public static int findGCD(int num1, int num2) 
	   {
	      if(num2 == 0)
	      {
	         return num1;
	      }
	      else
	      {
	         return findGCD(num2, num1 % num2);
	      }
	   }
	   public static int findGCD(int num1, int num2, int num3) 
	   {
	      return findGCD(findGCD(num1, num2), num3);
	   }
}