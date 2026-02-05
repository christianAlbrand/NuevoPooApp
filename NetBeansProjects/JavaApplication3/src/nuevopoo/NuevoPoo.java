package nuevopoo;

import models.Caja;
import models.Circulo;
import processing.core.PApplet;

public class NuevoPoo extends PApplet {

    Caja cielo1;
    Caja cielo2;
    Caja cielo3;

    Circulo sol;

    Caja suelo;

    public static void main(String[] args) {
        PApplet.main(NuevoPoo.class);
    }

    @Override
    public void settings() {
        size(600, 400);
    }

    @Override
    public void setup() {
        cielo1 = new Caja();
        cielo1.getPosicion().setPosicion(0, 0);
        cielo1.getDimension().setDimension(600, 130);
        cielo1.setColor(color(110, 0, 0));
        cielo1.getBorde().setAncho(0);

        cielo2 = new Caja();
        cielo2.getPosicion().setPosicion(0, 130);
        cielo2.getDimension().setDimension(600, 100);
        cielo2.setColor(color(160, 20, 20));
        cielo2.getBorde().setAncho(0);

        cielo3 = new Caja();
        cielo3.getPosicion().setPosicion(0, 230);
        cielo3.getDimension().setDimension(600, 100);
        cielo3.setColor(color(210, 60, 30));
        cielo3.getBorde().setAncho(0);

        sol = new Circulo();
        sol.getPosicion().setPosicion(170, 120);
        sol.getDimension().setDimension(200, 200);
        sol.setColor(color(255, 110, 0));
        sol.getBorde().setAncho(0);
        
        
        suelo = new Caja();
        suelo.getPosicion().setPosicion(0, 330);
        suelo.getDimension().setDimension(600, 70);
        suelo.setColor(color(15, 5, 0));
        suelo.getBorde().setAncho(0);
    }

    @Override
    public void draw() {
        background(0);

        cielo1.dibujar(this);
        cielo2.dibujar(this);
        cielo3.dibujar(this);
        sol.dibujar(this);
        sol.moverHorizontal();

        //montanas
        fill(60, 25, 15); // lejanas
        triangle(40, 320, 200, 180, 360, 320);

        fill(40, 15, 10); // medias
        triangle(220, 330, 400, 210, 580, 330);

        fill(35, 10, 5); // cercanas
        triangle(-60, 330, 120, 220, 300, 330);
        
        fill(0);

        // Cactus izquierdo 
        rect(90, 245, 16, 95);   
        rect(75, 285, 16, 40);   
        rect(106, 275, 16, 40);   

        // Cactus medio 
        rect(170, 270, 12, 70);
        rect(160, 295, 12, 30);

        // Cactus derecho 
        rect(500, 235, 18, 105);
        rect(480, 285, 20, 40);
        rect(518, 275, 18, 40);

        suelo.dibujar(this);
    }
}
