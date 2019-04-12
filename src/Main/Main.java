/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.Panel;
import javax.swing.JFrame;

/**
 *
 * @author Steven
 */
public class Main {

    public static void main(String[] args) {
        JFrame windowFrame = new JFrame("Third paint");
        Panel panel = new Panel();
        windowFrame.setContentPane(panel);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.pack();
        windowFrame.setVisible(true);
        windowFrame.setResizable(false);
    }
}
