package cn.lihuan.builder;

public class ConcreteBuilder1 extends Builder{

    private Product product = new Product();

    @Override
    void builderA() {
        product.add("部件A");
    }

    @Override
    void builderB() {
        product.add("部件B");
    }

    @Override
    Product getResult() {
        return product;
    }
}
