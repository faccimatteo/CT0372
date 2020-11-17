package it.unive.clock;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class ClockViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setTitle("A clock viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockComponent comp = new ClockComponent();
        frame.add(comp);
        frame.setVisible(true);
        //##########
        //IMPORTANTE: dato che devo implementare un solo metodo non serve che faccio una classe anonima sotto ma basta che uso la funzione lambda specificando come devo implementare l'unico metodo rimanente (vedi funzioni sottostante)
        //##########
        /*Timer timer = new Timer(500, new ActionListener() {
        //Same as
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.repaint();
            }});
         */
        //mi serve implementare l'action listenere per guadagnare di prestazioni
        Timer timer=new Timer(500,actionEvent -> frame.repaint());
        timer.start();
    }
}
