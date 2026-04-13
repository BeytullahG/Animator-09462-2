package ru.gr094622.painting;

import java.awt.*;

public interface Paintable {
    int getWidth();
    int getHeight();
    void setWidth(int w);
    void setHeight(int h);
    void paint(Graphics g);
}
