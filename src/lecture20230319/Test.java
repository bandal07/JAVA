package lecture20230319;

public class Test {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");

                if (j % 9 == 0) {
                    System.out.println();
                }
            }
        }
    }
}