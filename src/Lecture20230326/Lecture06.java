package Lecture20230326;

public class Lecture06 {
    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++){
            for (int j = 0; j <= 59; j++){
                System.out.print(i + "시" + j + "분" + " ");

                if (j == 59){
                    System.out.println();
                }
            }
        }
    }
}
