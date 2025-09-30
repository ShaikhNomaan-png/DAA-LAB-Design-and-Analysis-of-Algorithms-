import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JosephusQueue {
    public static int josephus(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.add(queue.poll()); 
            }
            queue.poll(); 
        }

        return queue.peek(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of position at which person gets killed: ");
        int k = sc.nextInt();
        System.out.println("Survivor: " + josephus(n, k));
    }
}
