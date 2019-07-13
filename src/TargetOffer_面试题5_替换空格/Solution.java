package TargetOffer_面试题5_替换空格;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        int spaceNum = 0; // 计算空格数
        char[] chStr = str.toString().toCharArray();
        for (char tmpChar : chStr) {
            if (tmpChar == ' ') {
                spaceNum++;
            }
        }
        int strLen = str.toString().length();
        int rstLen = strLen + 2 * spaceNum;
        char[] rstChar = new char[rstLen];
        int spaceTmp = 0;
        for (int i = 0; i < rstLen; i++) {
            if (chStr[i - 2 * spaceTmp] == ' ') {
                rstChar[i] = '%';
                rstChar[i+1] = '2';
                rstChar[i+2] = '0';
                i += 2;
                spaceTmp++;
            } else {
                rstChar[i] = chStr[i - 2 * spaceTmp];
            }
        }
        return new String(rstChar);
    }
}
