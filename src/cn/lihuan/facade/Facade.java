package cn.lihuan.facade;

public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;
    SubSystemFour subSystemFour;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
        this.subSystemFour = new SubSystemFour();
    }

    public void methodA() {
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
        subSystemFour.methodFour();
    }

    public void methodB() {
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
