import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class JosephusLinkedList {
    public static int josephus(int n, int k) {
        Node head = new Node(1);
        Node prev = head;

        for (int i = 2; i <= n; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }
        prev.next = head; 

        Node temp = head;
        while (temp.next != temp) { 
            for (int i = 1; i < k - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next; 
            temp = temp.next; 
        }

        return temp.data; 
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
