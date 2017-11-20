package ru.bstu.iitus.vt41.chikel_gd;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Condo extends House {
    private @Setter
    @Getter
    int flats;

    @Override
    public void init(Scanner src) {
        System.out.println("Введите информацию о частном доме: ");
        System.out.println("Стоимость строительства: ");
        setCost(src.nextInt());
        src.nextLine();
        System.out.println("Материал здания: ");
        setMaterial(src.nextLine());
        System.out.println("Количество этажей:");
        setStoreys(src.nextInt());
        src.nextLine();
        System.out.println("Число квартир:");
        setFlats(src.nextInt());
    }

    @Override
    public String toString() {
        return "Стоимость строительства: " + Integer.toString(getCost())
                + " Материал здания: " + getMaterial()
                + " Количество этажей: " + Integer.toString(getStoreys())
                + " Владелец: " + Integer.toString(getFlats());
    }


}
