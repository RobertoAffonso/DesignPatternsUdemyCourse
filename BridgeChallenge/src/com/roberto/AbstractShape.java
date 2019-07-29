package com.roberto;

public abstract class AbstractShape {
    protected IColor color;

    protected abstract void drawShape(int border);

    protected abstract void modifyBorder(int border, int increment);

    protected AbstractShape(IColor color) {
        this.color = color;
    }
}
