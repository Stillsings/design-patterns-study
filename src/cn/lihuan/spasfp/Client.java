package cn.lihuan.spasfp;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        CashContext cc = new CashContext(type);
        double money = input.nextDouble();
        System.out.println(cc.getResult(money));
    }
}
