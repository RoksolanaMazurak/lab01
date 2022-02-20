package com.company;

import com.company.Jemstone;

public class Main {
    public static void main(String[] args) {
        Jemstone defaultStone = new Jemstone();
        Jemstone diamond = new Jemstone("diamond", 1, 6500);
        Jemstone sapphire = new Jemstone("sapphire", 3, 9300, 9, "green", "transparent");

        System.out.println(defaultStone.toString());
        System.out.println(diamond.toString());
        System.out.println(sapphire.toString());

        System.out.println();

        System.out.println(defaultStone.returnShape());
    }
}
