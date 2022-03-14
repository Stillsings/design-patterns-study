package cn.lihuan.sfp;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        CashSuper csSuper = CashFactory.createCashAccept(type);
        double money = input.nextDouble();
        System.out.println(csSuper.acceptCash(money));
    }
}
