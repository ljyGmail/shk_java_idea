package com.atguigu06.project.team.domain;

/**
 * ClassName: Architect
 * Package: atguigu06.project.team.domain
 * Description:
 *
 * @Author ljy
 * @Create 2025-03-18 오전 9:35
 * @Version 1.0
 */
public class Architect extends Designer {

    private int stock; // 股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam() {
        return getBasicDetailsForTeam() + "架构师\t" + getBonus() + "\t" + getStock();
    }
}
