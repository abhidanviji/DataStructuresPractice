import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class GCDArray{
    
    public static int gcd(int[] numbers)
    {
        if(numbers.length==1)
            return numbers[0];
        else {
            int x = numbers[0];
            int y = numbers[1];
            while(y%x!=0)
            {
                int rem = y%x;
                y = x;
                x = rem;
            }
            return x;
        }
    }
  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(gcd(arr));
    }
}