package HW_计算字符个数;

public class Solution {
    public int calCharNum (String str, char ch) {
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
