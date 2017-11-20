package ru.bstu.iitus.vt41.chikel_gd;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Restaurant extends Building {
    private @Getter @Setter String name;

    @Override
    public void init(Scanner src) {
        System.out.println("Введите информацию об ресторане");
        System.out.println("Стоимость строительства:");
        setCost(src.nextInt());
        System.out.println("Материал здания:");
        src.nextLine();
        setMaterial(src.nextLine());
        System.out.println("Название ресторана:");
        setName(src.nextLine());
        System.out.println("Назначение здания (описание):");
        setPurpose(src.nextLine());
    }

    @Override
    public String toString() {
        return "Стоимость строительства: " + Integer.toString(getCost())
                + " Материал здания: " + getMaterial()
                + " Назначение здания: " + getPurpose()
                + " Название ресторана: " + getName();
    }

}
