package ru.bstu.iitus.vt41.chikel_gd;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public abstract class Construction {
    private @Getter
    @Setter
    int cost;
    private @Getter
    @Setter
    String material;

    public abstract void init(Scanner src);
}
