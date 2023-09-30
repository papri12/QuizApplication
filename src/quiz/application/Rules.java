package quiz.application;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
                
        JLabel heading = new JLabel("Welcome " + name + " in Java quiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rule = new JLabel();
        rule.setBounds(20, 90, 700, 350);
        rule.setFont(new Font("Thoma", Font.PLAIN, 12));
        rule.setText(
                "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rule);
                
        back = new JButton("back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(Color.CYAN);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);



        setSize(800, 600);
        setLocation(300, 150);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else{
            setVisible(false);
            new Login();
           }
    }

    
    public static void main(String args[]) {
        new Rules("user");
    }
   }
