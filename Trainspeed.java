//Activity 8
import java.util.*;
public class Trainspeed {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int train_len,man_speed,time_taken;
		System.out.print("Enter the train length : ");
		train_len = sc.nextInt();
		System.out.print("Enter the man speed in km/hr : ");
		man_speed = sc.nextInt();
		System.out.print("Enter the time in seconds : ");
		time_taken = sc.nextInt();
		int relative_train_speed = ((train_len*18)/(time_taken*5));
		int train_speed = relative_train_speed + man_speed;
		System.out.print("The speed of train in km/hr is : "+train_speed);
	}
}
