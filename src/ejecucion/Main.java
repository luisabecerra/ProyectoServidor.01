/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;

import java.io.FileNotFoundException;
import javax.swing.JFrame;
import juegos.Juegos;

/**
 *
 * @author Felipe
 */
public class Main extends JFrame {
    public Main() throws FileNotFoundException{
    unit();
}
    public void unit() throws FileNotFoundException{
      
        add(new Juegos());
        setSize(500, 500);
        setResizable(true);
       
        setTitle("LABERINTO MATIC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
    }
    public static void main(String[] args) throws FileNotFoundException {
        new Juegos();
    }
    
}
