package HW_计算字符个数;

import java.util.Scanner;

public class SolutionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        String strIn = str[0].toLowerCase();
        char ch = str[1].toLowerCase().charAt(0);
        Solution solution = new Solution();
        int num = solution.calCharNum(strIn, ch);
        System.out.println(num);
    }
}
