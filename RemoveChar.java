//Activity 6
import java.util.*;
public class RemoveChar {

	static void removeDuplicate(char str[], int len)   
    {   
        int index = 0,i,j;   
        for (i = 0; i < len; i++)   
        {       
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }  
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));    
    }   
    public static void main(String[] args)   
    {   
    	Scanner sc= new Scanner(System.in);
    	String string= sc.nextLine();
        char str[] = string.toCharArray();  
        int len = str.length;   
        removeDuplicate(str, len);   
    }   

}
