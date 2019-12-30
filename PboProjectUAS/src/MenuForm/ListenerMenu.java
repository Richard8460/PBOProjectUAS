/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class ListenerMenu extends FrameMenu{
    public ListenerMenu(){
        JBcek.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(JRBgenderpria.isSelected()&&JCBlayanan.getSelectedIndex()==0){
                    JTFcek.setText("Rp.15000");
                }
                if(JRBgenderpria.isSelected()&&JCBlayanan.getSelectedIndex()==1){
                    JTFcek.setText("Rp.35000");
                }
                if(JRBgenderpria.isSelected()&&JCBlayanan.getSelectedIndex()==2){
                    JTFcek.setText("Rp.50000");
                }
                if(JRBgenderwanita.isSelected()&&JCBlayanan.getSelectedIndex()==0){
                    JTFcek.setText("Rp.20000");
                }
                if(JRBgenderwanita.isSelected()&&JCBlayanan.getSelectedIndex()==1){
                    JTFcek.setText("Rp.45000");
                }
                if(JRBgenderwanita.isSelected()&&JCBlayanan.getSelectedIndex()==2){
                    JTFcek.setText("Rp.75000");
                }
                
            }
        });
        JBtransaksi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(JTFnama.getText().isEmpty()||JTFcek.getText().isEmpty()){
                    JOptionPane.showMessageDialog(pane, "Nama/Harga belum ada!!");
                    
                }
                else{
                    row[0] = JTFnama.getText();
                    row[1] = JCBlayanan.getSelectedItem();
                    row[2] = JTFcek.getText();
                    model.addRow(row);
                   
                }
            }
        });
        JBexit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(pane, "Are you sure? ","Confirm Exit",JOptionPane.OK_CANCEL_OPTION);
                if(result == JOptionPane.OK_OPTION){
                    System.exit(0);
                }
            }
        });
    }
}
