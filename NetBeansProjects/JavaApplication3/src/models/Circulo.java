package models;

import processing.core.PApplet;

public class Circulo extends Figura{

    public Circulo() {
        this(new Posicion(), new Dimension(100, 100), new Borde(), 255);
    }

    public Circulo(Posicion posicion, Dimension dimension, Borde borde, int color) {
        super(new Posicion(), new Dimension(100, 100), new Borde(), 255);
    }
    
    @Override
    public void dibujar(PApplet p) {
        p.stroke(borde.getColor());
        p.strokeWeight(borde.getAncho());
        p.fill(color);

        float x = this.posicion.getX();
        float y = this.posicion.getY();
        int ancho = this.dimension.getAlto();
        int altura = this.dimension.getAncho();

//        int diametro = Math.min(
//            dimension.getAncho(),
//            dimension.getAlto()
//        );

//        p.ellipse(x + diametro / 2, y + diametro / 2, diametro, diametro);
        
        p.ellipse(x, y, ancho, altura);
    }
}
