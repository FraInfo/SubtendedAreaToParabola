/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import java.awt.Canvas;
import java.awt.Color;

/**
 *
 * @author Francesco
 */
public interface Function {
    
    void drawFunction (Canvas canvas, Color color);
    
    double getFunction (double x);
    
}
