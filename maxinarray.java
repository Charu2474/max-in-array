import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=v.nextInt();
        }
        int max=a[n-1];
        System.out.print("The Best Leaders are ");
        System.out.print(max+" ");
        for(i=n-2;i>=0;i--)
        {
            if(a[i]>max)
            {
                max=a[i];
                System.out.print(max+" ");
            }
            
        }
        
    }
}
