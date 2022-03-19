package cn.lihuan.fp;

public class Client {
    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.setNumber1(200);
        oper.setNumber2(100);
        System.out.println(oper.getResult());
    }
}
