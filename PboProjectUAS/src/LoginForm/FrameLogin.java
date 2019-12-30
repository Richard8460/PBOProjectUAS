/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;

import FontForm.MyOwnFont;
import javax.swing.*;


/**
 *
 * @author Acer
 */
public class FrameLogin{
    MyOwnFont objMyOwnFont = new MyOwnFont();
    //Komponen - Komponen
    JFrame frame = new JFrame("ADMIN");
    JLabel JLlogin = new JLabel ("LOGIN");
    JLabel JLnama = new JLabel ("Nama");
    JLabel JLpassword = new JLabel ("Password");
    JTextField JTFnama = new JTextField();
    JPasswordField JPFpassword = new JPasswordField();
    //================================================
    public FrameLogin(){
        //Komponen Setting
        JLlogin.setBounds(110,0,200,40);
        JLlogin.setFont(objMyOwnFont.font);
        JLnama.setBounds(30,30,100,40);
        JLnama.setFont(objMyOwnFont.fonttwo);
        JLpassword.setBounds(30,60,100,40);
        JLpassword.setFont(objMyOwnFont.fonttwo);
        JTFnama.setBounds(110,40,140,20);
        JPFpassword.setBounds(110,70,140,20);
        //================================================
        //Frame Setting
        frame.add(JTFnama);
        frame.add(JPFpassword);
        frame.add(JLpassword);
        frame.add(JLnama);
        frame.add(JLlogin);
        
        frame.setSize(300,150);
       
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //=================================================
    }

    
}
