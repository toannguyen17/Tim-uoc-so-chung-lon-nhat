package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bài tập tìm ước trung lớn nhất.");

        System.out.println("Nhập vào số nguyên A.");
        int numA = Math.abs(scanner.nextInt());

        System.out.println("Nhập vào số nguyên B.");
        int numB = Math.abs(scanner.nextInt());

        if(numA == 0 || numB == 0) {
            System.out.println("No greatest common factor.");
        }else{
            int min;
            if (numB > numA) {
                min = numA;
            } else {
                min = numB;
            }
            for (int i = min-1; i > 0; i--) {
                if (numA % i == 0 && numB % i == 0) {
                    System.out.printf("\nƯớc trung lớn nhất của %d và %d là: %d", numA, numB, i);
                    break;
                }
            }
        }
    }
}
