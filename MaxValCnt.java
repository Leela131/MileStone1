//Activity 2
import java.io.*;
import java.util.*;
public class MaxValCnt {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[25];
		int maxVal=0,maxValCount=0;
		System.out.print("Enter the value of Array: ");
		for(int i=0;i<25;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>maxVal){
			     maxVal=arr[i];
	        }
		}
		for(int i=0;i<25;i++){
			if(arr[i]==maxVal) {
				maxValCount++;
			}
	    }
		System.out.println("The count of the maximum value is: "+maxValCount);
}
}
