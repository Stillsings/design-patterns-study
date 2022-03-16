package cn.lihuan.dp;

public class Client {
    public static void main(String[] args) {
        Sneaker sneaker = new Sneaker();
        Trouser trouser = new Trouser();
        Tshirts tshirts = new Tshirts();

        trouser.decorate(sneaker);
        tshirts.decorate(trouser);

        tshirts.show();
    }
}
