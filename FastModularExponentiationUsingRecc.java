public class FastModularExponentiationUsingRecc {
    public static long modExp(long base, long exp, long mod) {
        if (exp == 0) return 1;
        
        long half = modExp(base, exp / 2, mod);
        long result = (half * half) % mod;
        
        if (exp % 2 == 1) { 
            result = (result * base) % mod;
        }
        
        return result;
    }

    public static void main(String[] args) {
        long base = 2, exp = 10, mod = 1000000007;
        System.out.println("Result: " + modExp(base, exp, mod)); 
    }
}
