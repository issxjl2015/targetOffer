package TargetOffer_面试题58_翻转字符串;

public class Solution {

    public String ReverseSentence(String str) {
        if (str == null) {
            return null;
        }
        if (str.trim().equals("")) {
            return str;
        }
        String[] strArray = str.split(" ");
        int arrayLen = strArray.length;
        StringBuffer sb = new StringBuffer();
        for (int i = arrayLen - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(strArray[i]);
            } else {
                sb.append(strArray[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
