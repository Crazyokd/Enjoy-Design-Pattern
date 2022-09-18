package main;

//Effective Java作者推荐的枚举单例（线程安全）
public enum Singleton_07 {

    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }

}
