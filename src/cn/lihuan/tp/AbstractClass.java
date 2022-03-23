package cn.lihuan.tp;

public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void TemplateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
}
