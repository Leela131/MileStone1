//Activity 5
import java.io.*;
import java.util.*;
public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the values: ");
		for(int i=0;i<10;i++){
			int a=sc.nextInt();
			sum+=a;
		}
		System.out.print("The Average 10 number entered is: "+sum/10.0);

	}
}
