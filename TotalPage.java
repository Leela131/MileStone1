//Activity 11
import java.util.*;
public class TotalPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=32,Y=40,T1=6,T2=5;
	    float Xavg=X/(float)T1;
	    float Yavg=Y/(float)T2;
        float c=(Xavg+Yavg);
	    float time_Taken=110/c;
	    int hr=(int)time_Taken;
	    int mins = (int)((time_Taken-hr)*100);
	    System.out.println("The time taken by both to complete 110 pages is : "+hr+" hours "+mins+" minutes");
	}

}
