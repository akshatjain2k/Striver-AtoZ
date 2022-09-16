package Patterns;

import java.util.Scanner;

public class test {

    static Scanner in = new Scanner(System.in);

    static void pattern1() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern7() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern9() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (i % 2 == 0)
                    if (j % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                else if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    static void pattern11() {
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
        // pattern7();
        // pattern8 = pattern6(); + pattern7();
        // pattern9();
        // pattern10();
        pattern11();

    }
}
