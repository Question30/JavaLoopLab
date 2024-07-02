public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //Find the greatest common divisor
        System.out.println(GCD(2, 4));
        System.out.println(GCD(16, 24));

    }

    public static int GCD(int n1, int n2){
        int largest = Math.max(n1, n2);
        int gcd = 1;

        for (int i = 1; i < largest; i++){
            if(n1 % i == 0 && n2 % i == 0){
                if(i > gcd){
                    gcd = i;
                }
            }
        }

        return gcd;
    }
}
