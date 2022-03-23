package cn.lihuan.tp;

public class Client {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        a.TemplateMethod();
        AbstractClass b = new ConcreteClassB();
        b.TemplateMethod();
    }
}
