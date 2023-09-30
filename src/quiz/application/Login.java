package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton button, back;
    JTextField tfname;
    
    Login () {
        getContentPane().setBackground(Color.white);
        setLayout(null);
                
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("JAVA  Quiz");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300,30);
        tfname.setFont(new Font("Times now Roman", Font.PLAIN, 20));
        add(tfname);
        
        button = new JButton("Submit");
        button.setBounds(735, 270, 120, 25);
        button.setBackground(Color.CYAN);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);
        
        back = new JButton("back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(300,200);
        setVisible(true);
    }
                
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            String name = tfname.getText();
                setVisible(false);
                new Rules(name);
            } else if(e.getSource() == back) {
                setVisible(false);
            }
        }
    public static void main(String args[]) {
         new Login();
    }

    
}
