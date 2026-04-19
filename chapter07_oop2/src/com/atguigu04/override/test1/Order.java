package com.atguigu04.override.test1;

public class Order {
    private int orderPrivate;
     int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate() {
    }

    void methodDefault() {
    }

    protected void methodProtected() {
    }

    public void methodPublic() {
    }

    // 类内部
    public  void show(){
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;

        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();
    }
}
