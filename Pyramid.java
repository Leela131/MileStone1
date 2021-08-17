//Activity 3
import java.io.*;
import java.util.*;
public class Pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the level of pyramid : ");
		int N=sc.nextInt();
		int p=1,s=N-1,num=1;
		while(p<=N){
			for(int i=1;i<=s;i++)
				System.out.print(" ");
			for(int i=1;i<=p;i++){
				if(num>9){
					num=num%9-1;
				}
				System.out.print(num);num++;
			}
			int X=num-2;
			for(int i=1;i<p;i++){
				if(X<0){
					X=9;
				}
				System.out.print(X);X--;
			}
			p++;System.out.print("\n");s--;
		}
	}
}