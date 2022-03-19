package cn.lihuan.fp;

public class OperationAdd extends Operation{
    @Override
    public int getResult() {
        return getNumber1() + getNumber2();
    }
}
