/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuForm;
import javax.swing.*;
import FontForm.MyOwnFont;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class FrameMenu {
    MyOwnFont objMyOwnFont = new MyOwnFont();
    //Komponen - Komponen
    JFrame frame = new JFrame("Menu");
    JLabel JLbarbershop = new JLabel("====BARBERSHOP====");
    JLabel JLnama = new JLabel ("Nama");
    JLabel JLgender = new JLabel ("Gender");
    JLabel JLlayanan = new JLabel ("Layanan");
    
    JButton JBcek = new JButton ("cek");
    JButton JBtransaksi = new JButton ("Transaksi");
    JButton JBexit = new JButton ("Exit");
    
    JTextField JTFnama = new JTextField();
    JTextField JTFcek = new JTextField();
    
    JRadioButton JRBgenderpria = new JRadioButton("Pria");
    JRadioButton JRBgenderwanita = new JRadioButton ("Wanita");
    
    String[]box ={"Potong Rambut","Semir","Keramas"};
    JComboBox JCBlayanan = new JComboBox(box);
    
    JTable table = new JTable();
    Object[]columns = {"Nama","Layanan","Harga"};
    DefaultTableModel model = new DefaultTableModel(){
        public boolean isCellEditable (int row , int column){
            return false;
        }
    };
    JScrollPane pane = new JScrollPane(table);
    Object[]row = new Object[3];
    
    ButtonGroup group = new ButtonGroup();
    //====================================================
    public FrameMenu(){
        //Komponen Setting
        JLbarbershop.setBounds(100,50,300,50);
        JLbarbershop.setFont(objMyOwnFont.font);
        JLnama.setBounds(100,100,100,100);
        JLnama.setFont(objMyOwnFont.fonttwo);
        JLgender.setBounds(100,150,100,100);
        JLgender.setFont(objMyOwnFont.fonttwo);
        JLlayanan.setBounds(100,200,100,100);
        JLlayanan.setFont(objMyOwnFont.fonttwo);
        
        JBcek.setBounds(100,300,237,25);
        JBtransaksi.setBounds(100,400,100,25);
        JBexit.setBounds(239,400,100,25);
        
        JTFnama.setBounds(160,140,170,25);
        JTFcek.setBounds(100,350,237,35);
        JTFcek.setFont(objMyOwnFont.font);
        JTFcek.setHorizontalAlignment(JTextField.CENTER);
        JTFcek.setEditable(false);
        
        JRBgenderpria.setBounds(160,175,50,50);
        JRBgenderwanita.setBounds(220,175,100,50);
        
        JCBlayanan.setBounds(160,237,175,25);
        
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        pane.setBounds(20,450,385,75);
        table.setBackground(Color.lightGray);
        table.setForeground(Color.black);
        
        group.add(JRBgenderpria);
        group.add(JRBgenderwanita);
        
        
        //================================================
        //Frame Setting
        frame.add(pane);
        frame.add(JRBgenderpria);
        frame.add(JRBgenderwanita);
        frame.add(JCBlayanan);
        frame.add(JLbarbershop);
        frame.add(JLnama);
        frame.add(JLgender);
        frame.add(JLlayanan);
        frame.add(JBcek);
        frame.add(JBtransaksi);
        frame.add(JBexit);
        frame.add(JTFnama);
        frame.add(JTFcek);
        

        frame.setSize(430,650);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBackground(Color.yellow);

        frame.setVisible(true);
        
    }
}
