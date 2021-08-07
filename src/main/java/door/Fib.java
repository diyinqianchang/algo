package door;

public class Fib {

    public static void main(String[] args) {

        double v = fib2(10);
        System.out.println(v);

    }

    static double fib2(int n){

        double temp;
        if (n<1){
            return -1;
        }

        double a[] = new double[n+1];
        a[1] = a[2] = 1;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i-1]+a[i-2];
        }
        temp = a[n];
        return temp;

    }
}
