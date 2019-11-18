import java.awt.*;

public class Penguin extends Bird {
    private static String name ;
    private static int num = 0;
    public static int maxX = 0;
    public static int maxY = 0;
    public static int minX = Window.width+100;
    public static int minY = Window.height+100;

    public Penguin(String str,int x,int y){
        this.name=str;
        System.out.println("Меня зовут "+ this.name + "!");
        num++;
        System.out.println("Я Пингвин номер "+num);
        size = 50;
        color = Color.blue;
        this.fly();
        this.x=x;
        this.y=y;
    }
    public void fly(){
        System.out.println("Я не умею летать, я Пингвин -_-'");
    }
    public void draw(Graphics g){

        g.setColor(color);
        g.fillOval(x,y,size,size);
        g.setColor(Color.white);
        g.fillOval(x+20,y+20,8,8);
    }
}
