package cn.lihuan.strategy.simple.factory;

import cn.lihuan.simple.factory.CashNormal;
import cn.lihuan.simple.factory.CashRebate;
import cn.lihuan.simple.factory.CashReturn;
import cn.lihuan.simple.factory.CashSuper;

public class CashContext {
    private CashSuper cs = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                this.cs = new CashNormal();
                break;
            case "满300减100":
                this.cs = new CashReturn("300", "100");
                break;
            case "打8折":
                this.cs = new CashRebate("0.8");
                break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
