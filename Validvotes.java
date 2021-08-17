//Activity 9
import java.util.*;
public class Validvotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the total no of votes : ");
	    int X=sc.nextInt();
	    int valid_vote,first_mem_cnt,sec_mem_cnt;
	    valid_vote=X-((X*20)/100);
	    first_mem_cnt=(valid_vote*55)/100;
	    sec_mem_cnt = valid_vote - first_mem_cnt;
	    System.out.print("The number of valid votes that the other candidate got is: "+sec_mem_cnt);

	}

}
