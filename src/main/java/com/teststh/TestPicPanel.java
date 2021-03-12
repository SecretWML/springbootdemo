package com.teststh;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.net.URL;

public class TestPicPanel {
    public static void main(String[] args){
        JFrame frame = new JFrame("Test Image Panel");
        JLabel lbl = new JLabel();
        BufferedImage image = null;
        try {
            URL imageURL = new URL("https://yn1.jxlxsc.cn/uploads/userfiles/1/images/pageimg/20200615/1-2006151141414.jpg");
            image = ImageIO.read(imageURL);
            System.out.println("image is:"+image);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Container c= frame.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(lbl);
        lbl.setIcon(new ImageIcon(image));
        frame.setBounds(200,100,300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
