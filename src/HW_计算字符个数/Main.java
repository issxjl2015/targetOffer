package HW_计算字符个数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.nextLine().toLowerCase();
        char ch = scanner.next().toLowerCase().charAt(1);
        /*
        if (str.length < 2) {
            return;
        }
        */
        //String strIn = str[0].toLowerCase();
        //char ch = str[1].toLowerCase().charAt(0);
        //Solution solution = new Solution();
        int num = calCharNum(strIn, ch);
        System.out.println(num);
    }

    public static int calCharNum(String str, char ch) {
        char[] strArray = str.toCharArray();
        int num = 0;
        for (char tmp : strArray) {
            if (tmp == ch) {
                num++;
            }
        }
        return num;
    }
}
