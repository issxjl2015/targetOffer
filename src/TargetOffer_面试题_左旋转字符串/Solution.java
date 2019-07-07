package TargetOffer_面试题_左旋转字符串;

public class Solution {
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int len = str.length();
        // 对循环左移的位数取模
        int number = n % len;
        String strTemp = str.substring(number);
        String strTempTemp = str.substring(0, number);
        return strTemp + strTempTemp;
    }
}
