/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 *
 * @author GanapriyaS
 */
public class car extends Applet implements Runnable, KeyListener {

    Image img1;
    Image img2;
    int w0 = -150;
    int w1 = 40;
    int w2 = 230;
    int w3 = 420;
    int x1 = 340;
    int xx1 = 350;
    int yy1 = -180;
    Thread t;
    Random rand;
    int l = 185;
    int h = 500;
    String s = "Start Game";
    String s1="Score : ";
    int score = 0;

    @Override
    public void start() {
        setSize(800, 600);
        setBackground(Color.pink);
        addKeyListener(this);
        img1 = getImage(getDocumentBase(), "1.png");
        img2 = getImage(getDocumentBase(), "2.png");
        t = new Thread(this);
        t.start();
        rand = new Random();

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(200, 0, 400, 600);
        g.setColor(Color.WHITE);
        g.fillRect(380, w0, 40, 150);
        g.fillRect(380, w1, 40, 150);
        g.fillRect(380, w2, 40, 150);
        g.fillRect(380, w3, 40, 150);
        g.drawImage(img1, x1, 410, this);
        g.drawImage(img2, xx1, yy1, this);
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("TimesRoman", Font.BOLD, 26));
        g.drawString(s, 20, 100);
        g.drawString(s1+String.valueOf(score), 20, 200);

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
                w0 += 5;
                w1 = w1 + 5;
                w2 += 5;
                w3 += 5;
                if (w3 == 630) {
                    w3 = -150;
                }
                if (w2 == 630) {
                    w2 = -150;
                }
                if (w1 == 630) {
                    w1 = -150;
                }
                if (w0 == 630) {
                    w0 = -150;
                }
                if (yy1 == 630) {
                    xx1 = rand.nextInt(h - l) + l;
                    yy1 = -150;
                    score = score + 10;
                    repaint();
                }
                if(score<=30)
                yy1 += 5;
                else if(score<=60 && score>30)
                    yy1+=15;
                else if(score>60)
                    yy1+=30;
//                collision
                if (yy1 > 250) {
                    if (xx1 + 96 >= x1) {
                        int temp = xx1 + 96 - x1;
                        if (temp >= 25 && temp <= 96) {
                            s = "Game Over";
                            repaint();
                            t.stop();
                        }
                    }
                    if (xx1 <= x1 + 108) {
                        int temp1 = x1 + 108 - xx1;
                        if (temp1 >= 25 && temp1 <= 108) {
                            s = "Game Over";
                            repaint();
                            t.stop();
                        }
                    }

                }

//                ends
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (x1 < 500) {
                x1 += 5;
            }
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            if (x1 > 185) {
                x1 -= 5;
            }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
