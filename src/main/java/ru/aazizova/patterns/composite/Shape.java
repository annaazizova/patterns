package ru.aazizova.patterns.composite;

import java.awt.*;

/**
 * Created by aazizova on 04.10.2018.
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int X, int Y);
    boolean isInsideBounds(int X, int Y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
