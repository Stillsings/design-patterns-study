package cn.lihuan.builder;

public class Director {
    public void Construct(Builder builder) {
        builder.builderA();
        builder.builderB();
    }
}
