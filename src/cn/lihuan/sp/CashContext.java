package cn.lihuan.sp;

import cn.lihuan.sfp.CashSuper;

public class CashContext {
    private CashSuper cs;

    public CashContext(CashSuper cashSuper) {
        this.cs = cashSuper;
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
