import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задача 1");
        int [] number = new int[]{1, 2, 3,};
        float [] number2 = {1.57F, 7.654F, 9.986F};
        short[] number3 = new short[5];
        number3 [0] = 21;

        System.out.println();

        System.out.println("Задача 2");
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        for (int i = 0; i < number2.length; i++) {
            if (i == number2.length - 1) {
                System.out.println(number2[i]);
                break;
            }
            System.out.print(number2[i] + ", ");
        }
        for (int i = 0; i < 6; i++) {
            if (i == number3.length - 1) {
                System.out.println(number3[i] + ", ");
                break;
            }
            System.out.print(number3[i] + ", ");
        }

        System.out.println();

        System.out.println("Задача 3");
        for (int i = number.length; i >= 0; i--) {
            if (i == 1) {
                System.out.println(i);
                break;
            }
            System.out.print(i + ", ");
        }

        for (int i = number2.length - 1; i >= 0; --i) {
            if (i == 0) {
                System.out.println(number2[i]);
                break;
            }
            System.out.print(number2[i] + ", ");
        }

        for (int i = number3.length - 1; i >= 0; --i) {
            if (i == 0) {
                System.out.println(number3[i]);
                break;
            }
            System.out.print(number3[i] + ", ");
        }

        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i]++;;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}