public class HarmonicNumber {
    public static double HarmonicNum(int n) {
        double sum = 0.0;
        for (int i=1;i<= n;i++) {
            sum+=1.0/i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        double result = HarmonicNum(n);
        System.out.println("The " + n + "th harmonic number is: " + result);
    }
}
