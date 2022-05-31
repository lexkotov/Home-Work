package Lesson3;

public class Main {
    public static void main(String args[]) {
        Number1();
        Number2();
        Number3();
        Number4();
    }

    public static void Number1() {
        int[] num = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int num1 = num.length;

        for (int i = 0; i < num1; i++) {
            System.out.print(i + " " + num[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < num1; i++)
            if (num[i] == 1) {
                num[i] = 0;
            } else num[i] = 1;
        for (int i = 0; i < num1; i++) {
            System.out.print(i + " " + num[i]);
        }
    }

    public static void Number2() {
        int[] a = new int[100];
        int b = 0;
        int c = a.length;
        for (int i = 0; i < c; ++i, b = b + 1) {
            a[i] = b;
            System.out.println(b);

        }
    }

    public static void Number3() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int b = a.length;
        for (int i = 0; i < b; i++) {
            if (a[i] < 6)
                a[i] = a[i] * 2;
        }
        for (int i = 0; i < b; i++) {

            System.out.print(a[i] + " ");

        }
    }

    public static void Number4() {

        int[][] cube = new int[6][6];

        for (int a = 0; a < cube[0].length; a++) {
            cube[a][a] = 1;
        }
        for (int a = 0; a < cube[0].length; a++) {
            cube[cube.length - 1][a] = 1;
        }
        for (int a = 0; a < cube.length; a++) {
            cube[a][0] = 1;
        }
        for (int a = 0; a < cube[0].length; a++) {
            cube[a][cube[a].length - 1] = 1;
        }


        for (int a = 0; a < cube.length; a++) {
            for (int b = 0; b < cube[a].length; b++) {
                System.out.print(cube[a][b] + " ");
            }
            System.out.println();
        }

    }

}
