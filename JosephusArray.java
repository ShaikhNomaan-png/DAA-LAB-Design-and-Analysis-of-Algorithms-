import java.util.ArrayList;

public class JosephusArray {
    public static int josephus(int n, int k) {
        ArrayList<Integer> people = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0; 
        
        while (people.size() > 1) {
            index = (index + k - 1) % people.size(); 
            people.remove(index); 
        }

        return people.get(0); 
    }

    public static void main(String[] args) {
        int n = 5, k = 3;
        System.out.println("Survivor: " + josephus(n, k)); 
    }
}
