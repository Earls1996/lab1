package ru.bstu.iitus.vt41.chikel_gd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ConstructionsIndex {
    private Construction[] list;

    public ConstructionsIndex(int size) {
        list = new Construction[size];
    }

    public void sorted() {
        Arrays.sort(list, new Comparator<Construction>() {
            public int compare(Construction a, Construction b) {
                return a.getCost() - b.getCost();
            }
        });
    }

    public void output() {
        System.out.println("Вывод индекса: ");
        for (Construction x : list) {
            System.out.println(x.toString());
        }
    }

    public void buildIndex(Scanner src) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Выберите тип сооружения:"
                    + "1-Отель; 2-Ресторан; 3-Частный дом; 4-Многоквартирный дом");
            int choice = src.nextInt();
            while (choice < 0 || choice > 4) {
                System.out.println("Неправильный выбор. Попробуйте еще раз");
                System.out.println("Выберите тип сооружения:"
                        + "1-Отель; 2-Ресторан; 3-Частный дом; 4-Многоквартирный дом");
                choice = src.nextInt();
            }
            switch (choice) {
                case 1:
                    list[i] = new Hotel();
                    break;
                case 2:
                    list[i] = new Restaurant();
                    break;
                case 3:
                    list[i] = new PrivateHouse();
                    break;
                case 4:
                    list[i] = new Condo();
                    break;
            }
            list[i].init(src);

        }
    }

}
