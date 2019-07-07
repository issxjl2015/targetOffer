package TargetOffer_面试题38_字符串的排序;

import java.util.ArrayList;
import java.util.Scanner;

public class SolutionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution solution = new Solution();
        ArrayList<String> strArray = new ArrayList<>();
        strArray = solution.Permutation(str);
        System.out.println("输入字符为：" + str);
        for (String temp : strArray) {
            System.out.println("输出字符为：" + temp);
        }
    }
}
