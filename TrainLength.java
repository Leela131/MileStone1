//Activity 7
import java.io.*;
import java.util.*;
public class TrainLength {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int train_speed,time_taken,train_length;
		System.out.println("Enter the train speed in km/hr : ");
		train_speed=sc.nextInt();
		System.out.println("Enter the time in seconds : ");
		time_taken=sc.nextInt();
		train_length = (train_speed * 1000 * time_taken)/3600;
		System.out.print("The length of train is : "+train_length+ "m");
	}
}
