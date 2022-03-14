package cn.lihuan.strategy;

import cn.lihuan.simple.factory.CashSuper;

public class CashContext {
    private CashSuper cs;

    public CashContext(CashSuper cashSuper) {
        this.cs = cashSuper;
    }

    public double GetResult(double money) {
        return cs.acceptCash(money);
    }
}
