package sk.numero.oldgames.cdogs.graphic;

import javax.swing.*;

public class MainMenu {

    private boolean windowDisplayed;

    public MainMenu() {
        this.windowDisplayed = true;
        //drawMenu();
    }

    public void drawMenu()
    {
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton("Click Here");
        b.setBounds(50,100,95,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }



}
