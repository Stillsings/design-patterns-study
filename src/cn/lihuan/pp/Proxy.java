package cn.lihuan.pp;

public class Proxy extends Subject{
    private RealSubject realSubject = null;

    @Override
    public void request() {
        if(realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
