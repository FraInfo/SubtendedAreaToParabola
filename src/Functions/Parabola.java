/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Francesco
 */
public class Parabola implements Function{

    double a, b, c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void drawFunction(Canvas canvas, Color color) {
        Graphics graphics = canvas.getGraphics();
        graphics.setColor(color);

        int halfWidth = canvas.getWidth() / 2;
        int halfHeight = canvas.getHeight() / 2;

        for ( double x = -halfWidth; x < halfWidth; x += .01 ) {

            double y = getFunction(x);

            graphics.drawLine(
                    (int) x + halfWidth,
                    (int) -y + halfHeight,
                    (int) x + halfWidth,
                    (int) -y + halfHeight
            );
        }
    }

    @Override
    public double getFunction(double x) {
        double res = a * Math.pow(x, 2)+ b * x + c;
        return Math.abs(res);
    }
    
}
