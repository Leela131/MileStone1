//Activity 4
import java.io.*;
import java.util.*;
public class Factorial {
	public static int factorial(int N) {
		if(N==1)
			return N;
	    return N*factorial(N-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(factorial(N));
	}

}
