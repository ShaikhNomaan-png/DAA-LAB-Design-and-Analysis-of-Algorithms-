import java.util.*;

public class selectRandomPermutation {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = i+1;
        }

        int curr = n;
        while (curr > 0) {
            int random = generateRand(curr);
            swap(A, random, curr - 1);
            curr--;
        }
        
        System.out.println("Random permutation:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nThe avg max update : ");
        System.out.println(findAvgMax(n));
        sc.close();
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static int generateRand(int n) {
        return (int) (Math.random() * n);
    }

    public static double findAvgMax(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            int fact = facto(i);
            sum+=fact;
        }
        double avg = (double) sum/facto(n);
        return avg;
    }
    public static int facto(int n){
        int pro = 1;
        for (int i=1; i<=n; i++){
            pro*=i;
        }
        return pro;
    }
}