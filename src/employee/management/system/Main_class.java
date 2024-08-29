package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main_class extends JFrame {

    Main_class(){

        //background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

        JLabel heading = new JLabel("Employee Central");
        heading.setBounds(420,155,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));

        //heading above the img, therefore:
        img.add(heading);


        //Add button

        JButton add = new JButton("Add Employee");
        add.setBounds(335,270,150,40);

        //by default background color of text is sky blue, and text color is black, now editing it
        add.setForeground(Color.WHITE);
        add.setBackground(Color.black);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        img.add(add);


        //View Button

        JButton view = new JButton("View Employee");
        view.setBounds(565,270,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.black);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewEmployee();
                setVisible(false);
            }
        });
        img.add(view);

        //update button

        JButton update = new JButton("Update Employee");
        update.setBounds(335,370,150,40);

        //by default background color of text is sky blue, and text color is black, now editing it
        update.setForeground(Color.WHITE);
        update.setBackground(Color.black);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Update();
                setVisible(false);
            }
        });
        img.add(update);


        //Remove button

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(565,370,150,40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.black);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        img.add(rem);


        setSize(1120,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Main_class();

    }
}
