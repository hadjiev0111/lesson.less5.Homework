package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

	Boss boss = new Boss();
	boss.setHealth(700);
	boss.setDamage(50);
	boss.setDefenceType("Critical punch");

        System.out.println(boss.getHealth());
        System.out.println(boss.getDamage());
        System.out.println(boss.getDefenceType());
    }
}
