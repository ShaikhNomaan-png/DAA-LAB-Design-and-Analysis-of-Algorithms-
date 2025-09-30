import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {



    public static void mergeSort(int[] arr,int[] brr,int[] crr){
        int i=0,j=0,k=0;

        while(j<brr.length && k<crr.length){
            if(brr[j]<crr[k]){
                arr[i]=brr[j];
                i++;
                j++;
            }
            else{
                arr[i]=crr[k];
                i++;
                k++;
            }
            
        }

        while(j<brr.length){
            arr[i]=brr[j];
            j++;
            i++;
        }

        while(k<crr.length){
            arr[i]=crr[k];
            k++;
            i++;
        }

    }

    public static void merge(int[] arr){

        if(arr.length==1) return;

        int[] brr=new int[arr.length/2];
        int[] crr=new int[arr.length-arr.length/2];

        for(int i=0;i<brr.length;i++){
            brr[i]=arr[i];
        }
        
        int k=arr.length/2;
        for(int j=0;j<crr.length;j++){
            crr[j]=arr[k];
            k++;
        }

        merge(brr);
        merge(crr);

        mergeSort(arr,brr,crr);
        
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the array ele: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        merge(arr);

        System.out.println(arr[arr.length/2]);

    }
    
}
