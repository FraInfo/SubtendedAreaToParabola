/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import java.awt.Point;

/**
 *
 * @author Francesco
 */
public class PseudoRandomPoints {
    
    double Xa, Xb, Ya, Yb;

    public PseudoRandomPoints(double Xa, double Xb, double Ya, double Yb) {

        this.Xa = Xa;
        this.Xb = Xb;
        this.Ya = Ya;
        this.Yb = Yb;

    }

    public Point [] generatePseudoRandomPoints (int numPoints) {
        Point [] points = new Point[numPoints];

        for (;numPoints-->0;){
            int X = (int) (Math.random() * (Xb - Xa) + Xa);
            int Y = (int) (Math.random() * (Yb - Ya) + Ya);

            points [numPoints] = new Point (X,Y);
        }
        return points;
    }
    
}
