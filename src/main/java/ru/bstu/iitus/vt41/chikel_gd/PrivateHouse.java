package ru.bstu.iitus.vt41.chikel_gd;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class PrivateHouse extends House {
    private @Getter
    @Setter
    String owner;

    @Override
    public void init(Scanner src) {
        System.out.println("������� ���������� � ������� ����: ");
        System.out.println("��������� �������������: ");
        setCost(src.nextInt());
        src.nextLine();
        System.out.println("�������� ������: ");
        setMaterial(src.nextLine());
        System.out.println("���������� ������:");
        setStoreys(src.nextInt());
        src.nextLine();
        System.out.println("��������:");
        setOwner(src.nextLine());
    }

    @Override
    public String toString() {
        return "��������� �������������: " + Integer.toString(getCost())
                + " �������� ������: " + getMaterial()
                + " ���������� ������: " + Integer.toString(getStoreys())
                + " ��������: " + getOwner();
    }


}
