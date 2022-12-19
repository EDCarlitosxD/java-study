package dic_18_22;

import java.util.Scanner;

public class Problem6 {
    public static int H, B;
    public static boolean flag = true;

    static {
        Scanner scan = new Scanner(System.in);

        B = scan.nextInt();
        H = scan.nextInt();

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main
}
