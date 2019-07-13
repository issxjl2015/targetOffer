package TargetOffer_面试题3_数组中重复的数字;

public class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2, 3, 1, 0, 2, 5, 3};
        int length = 7;
        int[] duplication = new int[length];
        boolean flag = solution.duplicate(numbers, length, duplication);
        System.out.println("flag:" + flag);
        System.out.println("duplication: " + duplication[0]);
    }
}
