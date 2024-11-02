package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{
    
    HotelManagementSystem(){
//        setSize(1366,768);
//        setLocation(100,100);
        setBounds(0,0,1366,768);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1366,768);
        add(image);
        
        JButton next = new JButton("NEXT");
        next.setBounds(1150,450,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.MAGENTA);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.PLAIN, 25));
        
        image.add(next);
      
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
