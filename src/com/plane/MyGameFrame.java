package com.plane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *  A test Plane Game for learning purpose
 *
 *
 */



public class MyGameFrame extends JFrame {

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.pink);
        g.fillRect(100,100,300,300);
        //g.drawString("Start",200,200);
    }

    /**
     * initialize the windows
     */
    public void launchFrame(){
        this.setTitle("Plane");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);

        this.addWindowListener(new WindowAdapter(){

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args){
        MyGameFrame frame = new MyGameFrame();
        frame.launchFrame();
    }

}
