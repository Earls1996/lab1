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
        System.out.println("������� ���������� � ������� ����: ");
        System.out.println("��������� �������������: ");
        setCost(src.nextInt());
        src.nextLine();
        System.out.println("�������� ������: ");
        setMaterial(src.nextLine());
        System.out.println("���������� ������:");
        setStoreys(src.nextInt());
        src.nextLine();
        System.out.println("����� �������:");
        setFlats(src.nextInt());
    }

    @Override
    public String toString() {
        return "��������� �������������: " + Integer.toString(getCost())
                + " �������� ������: " + getMaterial()
                + " ���������� ������: " + Integer.toString(getStoreys())
                + " ��������: " + Integer.toString(getFlats());
    }


}
