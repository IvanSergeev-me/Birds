import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;


public class Window extends JFrame {
    public static int width =1300;
    public static int height =800;

    private STAYA f;
    public Window(STAYA f){
        this.f= f;
        this.setTitle("КачалкаНаПК");
        this.setSize(width,height);
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("G:\\дз на флешке\\Задачи Основы Программирования\\Птицы отладка\\asswecan\\trademark.png"));
        } catch (IOException e) {
        }
        this.setSize(width,height);
        g.drawImage(img,Window.width-330, Window.height-65, null );
        f.draw(g);
        System.out.println(" Рисую в классе виндоу ");


    }


}
