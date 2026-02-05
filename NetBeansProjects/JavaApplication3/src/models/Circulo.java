package models;

import processing.core.PApplet;

public class Circulo {

    private Posicion posicion;
    private Dimension dimension;
    private int color;
    private Borde borde;

    public Circulo() {
        this(new Posicion(), new Dimension(100, 100), new Borde(), 255);
    }

    public Circulo(Posicion posicion, Dimension dimension, Borde borde, int color) {
        this.posicion = posicion;
        this.dimension = dimension;
        this.borde = borde;
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Borde getBorde() {
        return borde;
    }

    public int getColor() {
        return color;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void setBorde(Borde borde) {
        this.borde = borde;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void dibujar(PApplet p) {
        p.stroke(borde.getColor());
        p.strokeWeight(borde.getAncho());
        p.fill(color);

        float x = posicion.getX();
        float y = posicion.getY();

        int diametro = Math.min(
            dimension.getAncho(),
            dimension.getAlto()
        );

        p.ellipse(x + diametro / 2, y + diametro / 2, diametro, diametro);
    }
}
