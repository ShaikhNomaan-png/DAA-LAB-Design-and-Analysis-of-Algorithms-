public class JosephusMath {
    public static int josephus(int n, int k) {
        if (n == 1) return 0; 
        return (josephus(n - 1, k) + k) % n; 
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println("Survivor: " + (josephus(n, k) + 1)); 
    }
}
