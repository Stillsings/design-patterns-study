package cn.lihuan.strategy;

import cn.lihuan.simple.factory.*;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        CashContext cc = null;
        switch (type) {
            case "正常收费":
                cc = new CashContext(new CashNormal());
                break;
            case "满300减100":
                cc = new CashContext(new CashReturn("300", "100"));
                break;
            case "打8折":
                cc = new CashContext(new CashRebate("0.8"));
                break;
        }
        double money = input.nextDouble();
        System.out.println(cc.GetResult(money));
    }
}
