package TargetOffer_面试题_左旋转字符串;

import java.util.Scanner;

public class SolutionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "abcXYZdef";
        Solution solution = new Solution();
        String result = solution.LeftRotateString(str, n);
        System.out.println("输入字符串为：" + str);
        System.out.println("循环左移" + n + "位，输出的字符串为：" + result);
    }
}
