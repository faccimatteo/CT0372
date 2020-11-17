package it.unive.ch2.e20;
import javax.swing.*;
import java.awt.*;

public class myMain {

    public static void main(String[] args) {
        int width = 400;
        int height = 400;
        JFrame myframe = new JFrame("La mia finestra");
        myframe.setSize(width, height);//to simulate square with mac resolution
        myframe.setTitle("That's my name");
        if (args.length > 0) {
            myPanel firstPanel = new myPanel(50, 50, args[0]);
            myframe.add(firstPanel);
            myframe.setMaximumSize(new Dimension(width * 3, height * 3));
            myframe.setMinimumSize(new Dimension((int) (width / 2.5), (int) (height / 2.5)));
            myframe.show();
        } else
            System.out.println("Inserire una parola valida tramite command line");

    }
}
