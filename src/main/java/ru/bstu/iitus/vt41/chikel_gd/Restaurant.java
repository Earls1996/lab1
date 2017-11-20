package ru.bstu.iitus.vt41.chikel_gd;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Restaurant extends Building {
    private @Getter @Setter String name;

    @Override
    public void init(Scanner src) {
        System.out.println("������� ���������� �� ���������");
        System.out.println("��������� �������������:");
        setCost(src.nextInt());
        System.out.println("�������� ������:");
        src.nextLine();
        setMaterial(src.nextLine());
        System.out.println("�������� ���������:");
        setName(src.nextLine());
        System.out.println("���������� ������ (��������):");
        setPurpose(src.nextLine());
    }

    @Override
    public String toString() {
        return "��������� �������������: " + Integer.toString(getCost())
                + " �������� ������: " + getMaterial()
                + " ���������� ������: " + getPurpose()
                + " �������� ���������: " + getName();
    }

}
