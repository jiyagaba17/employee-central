package employee.management.system;


import javax.swing.*;
import java.awt.*;

//for designing frames - jframes
public class Splash extends JFrame {
    //constructor- same class name

    Splash(){

        //image on frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
        //scaling image acc to size of frame
        Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        //adding image on frame
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1170,650);
        add(image);


        //designing - size etc
        setSize(1170,650);

        //to open frame on center
        setLocation(200, 50);

        //layout- not default one, because by default- border layout
        setLayout(null);

        //by default visibility hidden, therfore to disply it , set true
        setVisible(true);


        // showing first front gif for certain time - 5s, then opening another

        try {
            Thread.sleep(5000);
            setVisible(false);

            //now open login frame

            new Login();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    //main function
    public static void main(String[] args) {

        //object of constructor in main class
        new Splash();

    }
}
