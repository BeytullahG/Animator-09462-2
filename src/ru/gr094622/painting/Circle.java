package ru.gr094622.painting;

import ru.gr094622.model.AbstractGeometryObject;

import java.awt.*;

public class Circle extends AbstractGeometryObject implements Paintable {

    public Circle(int x, int y, Dimension size, Color color, int xSpeed, int ySpeed) {
        super(x, y, size, color, xSpeed, ySpeed);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getSize().width, getSize().height);
    }
}
