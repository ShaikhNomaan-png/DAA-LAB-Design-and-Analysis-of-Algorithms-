import java.util.Arrays;
import java.util.Scanner;


public class MajorityUsingSort {
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the array ele: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        
        Arrays.sort(arr);

        System.out.println(arr[arr.length/2]);

    }
    
}
