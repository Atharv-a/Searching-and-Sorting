package basics;
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        sc.close();
        int j;
        for(j=0;j<n;j++)
        {
            if(arr[j]==s)
            {
                System.out.println(j);
                break;
            }
        }
        if(j==n)
        System.out.println("value not found");
        
    }
    
}
