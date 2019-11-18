import java.awt.*;

public class Macaw extends Bird {
    private static String name ;
    private static int num = 0;
    public static int maxX = 0;
    public static int maxY = 0;
    public static int minX = Window.width+100;
    public static int minY = Window.height+100;
    public Macaw(String str,int x,int y ){
        this.name = str;
        System.out.println("Меня зовут " + this.name + "!");
        num++;
        System.out.println("Я попугай номер " + num);
        size = 60;
        color = Color.green;
        this.fly();
        this.x=x;
        this.y=y;


    }
    void speak(String name){
        this.name = name;
        System.out.println("Меня зовут " + this.name + "!");
    }



    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void handshake(Macaw brd){
        System.out.println("Привет, я " + name + ". Ты " + brd.getName() + ", верно?");
    }
    public void fly(){
        System.out.println("Я лечууууу!!! , позвольте напомнить что меня зовут " + this.name);
        System.out.println("Иду на тараан!");
    }


}
