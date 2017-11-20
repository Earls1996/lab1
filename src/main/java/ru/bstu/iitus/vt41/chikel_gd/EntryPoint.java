package ru.bstu.iitus.vt41.chikel_gd;

import java.util.Scanner;

public class EntryPoint {

    public static void main(String[] args) {
        System.out.println("¬ведите число сооружений: ");
        Scanner src = new Scanner(System.in);
        int constructions = src.nextInt();
        ConstructionsIndex index = new ConstructionsIndex(constructions);
        index.buildIndex(src);
        index.sorted();
        index.output();
    }

}
