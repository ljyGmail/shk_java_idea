package com.atguigu05.exer.exer1;

public class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    // 根据对象的半径的大小，比较对象的大小。
    @Override
    public int compareTo(Object o) throws Exception {
        if (this == o) {
            return 0;
        }

        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            return Double.compare(this.getRadius(), c.getRadius());
        } else {
            // throw new RuntimeException("输入的类型不匹配");
            throw new Exception("输入的类型不匹配");
        }
    }
}
