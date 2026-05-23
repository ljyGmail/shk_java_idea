package com.atguigu05.exer.exer3;

/**
 * ClassName: Person
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 23. 오후 1:26
 * @Version 1.0
 */
public class Person {

    private String name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        // this.name = name;
        setName(name);
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue < 0) {
            throw new NoLifeValueException("生命值不能为负数: " + lifeValue);
        }
        this.lifeValue = lifeValue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
