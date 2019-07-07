package TargetOffer_面试题4_二维数组中的查找;

import java.util.Scanner;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int [] [] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        Boolean flag = solution.Find(target, array);
        if (flag == true) {
            System.out.println("恭喜，你输入的数字在二维数组里！");
        } else {
            System.out.println("抱歉，你输入的数字不在二维数组里！");
        }
    }
}
