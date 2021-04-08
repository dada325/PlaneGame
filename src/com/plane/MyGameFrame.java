package com.plane;

import javax.swing.JFrame;

/**
 *  A test Plane Game for learning purpose
 *
 *
 */
public class MyGameFrame extends JFrame {

    /**
     * initialize the windows
     */
    public void launchFrame(){
        this.setTitle("Plane");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);

    }

    public static void main(String[] args){
        MyGameFrame frame = new MyGameFrame();
        frame.launchFrame();
    }

}
