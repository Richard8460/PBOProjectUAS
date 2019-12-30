/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;
import MenuForm.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class ListenerLogin extends FrameLogin{
    AdminLogin objAdminLogin = new AdminLogin();

    public ListenerLogin(){
        JPFpassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String LogName = JTFnama.getText();
                String LogPassword = JPFpassword.getText();
                
                if(LogName.equals(objAdminLogin.getNama())&& LogPassword.equals(objAdminLogin.getPassword())){
                    frame.setVisible(false);
                    ListenerMenu objListenerMenu = new ListenerMenu(); 
                }else{
                    JOptionPane.showMessageDialog(frame, "Nama/Password salah!");
                }
            }
        });
        JTFnama.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String LogName = JTFnama.getText();
                String LogPassword = JPFpassword.getText();
                
                if(LogName.equals(objAdminLogin.getNama())&& LogPassword.equals(objAdminLogin.getPassword())){
                    frame.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(frame, "Nama/Password salah!");
                }
            }
        });
        
    }
}
