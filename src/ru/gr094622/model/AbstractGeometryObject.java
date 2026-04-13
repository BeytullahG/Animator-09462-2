package ru.gr094622.model;

import java.awt.*;

public abstract class AbstractGeometryObject implements GeometryObject {

    private int x;
    private int y;
    private Dimension size;
    private Color color;
    private int xSpeed;
    private int ySpeed;

    public AbstractGeometryObject(int x, int y, Dimension size, Color color, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public int getX() { return x; }

    @Override
    public void setX(int x) { this.x = x; }

    @Override
    public int getY() { return y; }

    @Override
    public void setY(int y) { this.y = y; }

    @Override
    public Dimension getSize() { return size; }

    @Override
    public void setSize(Dimension size) { this.size = size; }

    @Override
    public Color getColor() { return color; }

    @Override
    public int getXSpeed() { return xSpeed; }

    @Override
    public int getYSpeed() { return ySpeed; }

    @Override
    public void inverseXSpeed() { xSpeed = -xSpeed; }

    @Override
    public void inverseYSpeed() { ySpeed = -ySpeed; }

    @Override
    public abstract void paint(Graphics g);
}
