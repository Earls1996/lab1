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
        System.out.println("������� ���������� �� �����:");
        System.out.println("��������� �������������: ");
        setCost(src.nextInt());
        System.out.println("���������� ������: ");
        src.nextLine();
        setPurpose(src.nextLine());
        System.out.println("����� ������ � �����: ");
        setRooms(src.nextInt());
        System.out.println("�������� ������: ");
        src.nextLine();
        setMaterial(src.nextLine());
    }

    @Override
    public String toString() {
        return "��������� �������������: " + Integer.toString(getCost())
                + " ���������� ������: " + getPurpose()
                + " ����� ������: " + Integer.toString(getRooms())
                + " �������� ������: " + getMaterial();
    }
}
