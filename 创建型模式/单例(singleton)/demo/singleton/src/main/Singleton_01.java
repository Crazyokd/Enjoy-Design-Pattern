package main;

//懒汉式（线程不安全）
public class Singleton_01 {

    private static Singleton_01 instance;

    private Singleton_01() {
    }

    public static Singleton_01 getInstance(){
        if (null != instance) return instance;
        instance = new Singleton_01();
        return instance;
    }

}
