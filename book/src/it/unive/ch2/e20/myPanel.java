package it.unive.ch2.e20;

import javax.swing.*;
import java.awt.*;

public class myPanel extends JComponent{

    private int x;
    private int y;
    private String s;

    public myPanel(int x,int y,String s){
        super();
        this.x=x;
        this.y=y;
        this.s=s;
        this.setVisible(true);
    }

    //lasciamo il costruttore default di JPanel
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Rectangle clipBounds = g.getClipBounds();
        g.setFont(new Font(null,2,(int)clipBounds.getHeight()/s.length()));
        g.drawString(this.s,(int)clipBounds.getWidth()/3,(int)clipBounds.getHeight()/2);
        //g.drawString("Matteo",this.x,(int)clipBounds.getHeight()-(this.y));
        g.setColor(new Color(255,0,0));
        g.drawRect(this.x,this.y,(int)clipBounds.getWidth()-(this.x*2),(int)clipBounds.getHeight()-(this.y*2));//distanzio il mio rettangolo dal frame

    }

}
