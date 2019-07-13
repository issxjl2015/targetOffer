package TargetOffer_面试题5_替换空格;

import java.util.Scanner;

public class SolutionTest {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("helloworld ");
        Solution solution = new Solution();
        String result = solution.replaceSpace(sb);
        System.out.println(result);
//        System.out.println(result.length());
    }
}
