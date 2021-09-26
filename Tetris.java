//Stephen Duffy spd170330
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;



public class Tetris extends JPanel {
    public static void main (String[] args) {
        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.add(new Tetris());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }


    public void paint(Graphics g)
    {
        //Tetris game Box
        g.drawRect (300, 150, 200, 400);

        //Pause box
        g.setColor(Color.blue);
        g.drawRect (350, 300, 100, 40);
        g.drawString("PAUSE",380,325);

        //Next shape box
        g.setColor(Color.black);
        g.drawRect (515, 150, 120, 60);

        //Right side captions
        g.drawString("Level:          1",515,290);
        g.drawString("Lines:          0",515,330);
        g.drawString("Score:          0",515,370);

        //Quit
        g.drawRect (515, 520, 70, 30);
        g.drawString("QUIT",537,540);

        //Bottom Left
        g.setColor(Color.black);
        g.fillRect(300, 530, 20, 20);
        g.fillRect(320, 530, 20, 20);
        g.fillRect(320, 510, 20, 20);
        g.fillRect(320, 490, 20, 20);

        g.setColor(Color.yellow);
        g.fillRect(301, 531, 18, 18);
        g.fillRect(321, 531, 18, 18);
        g.fillRect(321, 511, 18, 18);
        g.fillRect(321, 491, 18, 18);

        //Bottom Right
        g.setColor(Color.black);
        g.fillRect(400, 530, 20, 20);
        g.fillRect(400, 510, 20, 20);
        g.fillRect(400, 490, 20, 20);
        g.fillRect(400, 470, 20, 20);

        g.setColor(Color.red);
        g.fillRect(401, 531, 18, 18);
        g.fillRect(401, 511, 18, 18);
        g.fillRect(401, 491, 18, 18);
        g.fillRect(401, 471, 18, 18);


        //Middle
        g.setColor(Color.black);
        g.fillRect(340, 230, 20, 20);
        g.fillRect(360, 230, 20, 20);
        g.fillRect(340, 210, 20, 20);
        g.fillRect(360, 210, 20, 20);

        g.setColor(Color.green);
        g.fillRect(341, 231, 18, 18);
        g.fillRect(361, 231, 18, 18);
        g.fillRect(341, 211, 18, 18);
        g.fillRect(361, 211, 18, 18);

        //g.drawRect (515, 150, 100, 60);
        //Next Shape
        g.setColor(Color.black);
        g.fillRect(535, 170, 20, 20);
        g.fillRect(555, 170, 20, 20);
        g.fillRect(575, 170, 20, 20);
        g.fillRect(595, 170, 20, 20);

        g.setColor(Color.blue);
        g.fillRect(536, 171, 18, 18);
        g.fillRect(556, 171, 18, 18);
        g.fillRect(576, 171, 18, 18);
        g.fillRect(596, 171, 18, 18);
    }

    //10x20 squares tetris board
    //20x20 squares
}
