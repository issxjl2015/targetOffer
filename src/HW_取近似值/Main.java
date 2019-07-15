package HW_取近似值;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dou = scanner.next();
        if (Float.valueOf(dou) <= 0) {
            return;
        }
        String[] douArray = dou.split("\\.");
        int zhengshu = Integer.valueOf(douArray[0]);
        int xiaoshu = Integer.valueOf(douArray[1].substring(0, 1));
        if (xiaoshu >= 5) {
            zhengshu += 1;
        }
        System.out.println(zhengshu);
    }
}
