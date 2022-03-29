package cn.lihuan.builder;

public class ConcreteBuilder2 extends Builder{
    private Product product = new Product();

    @Override
    void builderA() {
        product.add("部件C");
    }

    @Override
    void builderB() {
        product.add("部件D");
    }

    @Override
    Product getResult() {
        return product;
    }
}
