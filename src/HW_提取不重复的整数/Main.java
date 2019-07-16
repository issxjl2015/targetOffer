package HW_提取不重复的整数;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int num = 0;
        int[] inArray = new int[10]; // 因为数字不会超过十个
        while (input != 0) {
            if (inArray[input % 10] == 0) {
                inArray[input % 10]++;
                num =  num * 10 + input % 10;
            }
            input /= 10;
        }
        System.out.println(num);
    }
}
