//Activity 12
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n=sc.nextInt(),flag=1;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=0;
				break;
			}
		}
		if(flag==1){
			System.out.print("Value  is "+n+" prime number");
		}
		else {
			System.out.print("Value entered "+n+" is not a prime number");
		}
	}
}
