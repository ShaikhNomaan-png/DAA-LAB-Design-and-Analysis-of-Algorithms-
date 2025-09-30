public class FastModularExponentiation {
    public static long modExp(long base, long exp, long mod) {
        long result = 1;
        base = base % mod; 
        
        while (exp > 0) {
            if ((exp & 1) == 1) { 
                result = (result * base) % mod;
            }
            base = (base * base) % mod; 
            exp >>= 1; 
        }
        
        return result;
    }

    public static void main(String[] args) {
        long base = 2, exp = 10, mod = 1000000007;
        System.out.println("Result: " + modExp(base, exp, mod)); 
    }
}
