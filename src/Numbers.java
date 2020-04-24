public class Numbers {
    public static void main(String[] args) {
        double x = 0;
        while (x < 3) {
            x += 0.1;
            System.out.printf("%.1f" + ", ", x);
        }
        x = 0;
        System.out.println();
        do {
            x += 0.1;
            System.out.printf("%.1f" + ", ", x);
        }
        while (x < 3);
    }
}
