package interpolation;

public class task1 {
    public static void main(String[] args) {
        int v = 1;
        double eps = 0.1;
        int r = 5;

        for(int i = -r; i <= r; ++i){
            double s1 = v * i;
            double sum = s1;
            int k = 1;
            int n = 1;
            int minus = -1;

            while (Math.abs(s1) >= eps){
                s1 = minus * s1 * v * v * i * i / ((k + 1) * (k + 2));
                sum += s1;
                k += 2;
                n++;
            }

            System.out.printf("x = %-5d n = %-5d S(x) = %f \tdelta = %f\n", i, n, sum, sum - Math.sin(v * i));
        }
    }
}
