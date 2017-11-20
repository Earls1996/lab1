package ru.bstu.iitus.vt41.chikel_gd;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Hotel extends Building {
    private @Getter
    @Setter
    int rooms;

    @Override
    public void init(Scanner src) {
        System.out.println("Введите информацию об отеле:");
        System.out.println("Стоимость строительства: ");
        setCost(src.nextInt());
        System.out.println("Назначение здания: ");
        src.nextLine();
        setPurpose(src.nextLine());
        System.out.println("Число комнат в отеле: ");
        setRooms(src.nextInt());
        System.out.println("Материал здания: ");
        src.nextLine();
        setMaterial(src.nextLine());
    }

    @Override
    public String toString() {
        return "Стоимость строительства: " + Integer.toString(getCost())
                + " Назначение здания: " + getPurpose()
                + " Число комнат: " + Integer.toString(getRooms())
                + " Материал здания: " + getMaterial();
    }
}
