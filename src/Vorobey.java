import java.awt.*;

public class Vorobey extends Bird{
    private static String name ;
    private static int num = 0;
    public static int maxX = 0;
    public static int maxY = 0;
    public static int minX = Window.width+100;
    public static int minY = Window.height+100;

    public Vorobey(String str,int x,int y){
        this.name = str;
        System.out.println("Меня зовут " + this.name + "!");
        num++;
        System.out.println("Я воробей номер " + num);

        size = 40;
        color = Color.GRAY;
        this.fly();
        this.x=x;
        this.y=y;
    }

    public void fly(){
        System.out.println("Я лечу как попугай, но я так то воробей!");
    }
}
