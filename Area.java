//Activity 13
import java.util.*;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int diff,peri,sum,length,breadth;
	    diff= 23;peri = 206;
	    sum = peri/2;
	    length=(diff+sum)/2;
	    breadth=sum-length;
	    int area=length*breadth;
	    System.out.print("The area of rectangle is : "+area);
	}

}
