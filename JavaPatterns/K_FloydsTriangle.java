package JavaPatterns;

public class K_FloydsTriangle {
    public static void main(String[] args) {
        int n = 4;
        int a = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((++a) + " ");
            }
            System.out.println();
        }
    }
}
