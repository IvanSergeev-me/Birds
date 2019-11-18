import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class STAYA {
    //ident-отступ!
    int ident=30;
    int finMaxX=0,finMaxY=0,finMinX=Window.width+200,finMinY=Window.height+200;
    private ArrayList<Bird> flock;
    public STAYA(int n){
        flock=new ArrayList<Bird>(n);
        Scanner s=new Scanner(System.in);

        System.out.println("(1)-add Macaw; (2)-add Penguin; (3)-add Vorobey; (0)-Exit");
        for (int i=0; ;i++ ){
            int x,y;
            System.out.println("Выберите операцию (1)(2)(3)(0)");
            int p= s.nextInt();
            do {
                //( Math.random() * (b-a) ) + a      [a;b)
                x = (int)((Math.random() * (Window.width-4*ident))+ident);
                y = (int)((Math.random() * (Window.height-4*ident))+ident);
            } while (localXY(x, y));
            if (p==0){
                break;
            }
            if (p==1) {
                flock.add(new Macaw((Names.lib.names[(int)(( Math.random() * (6)))]),x,y));
                if(Macaw.maxX < x) Macaw.maxX = x;
                if(Macaw.maxY < y) Macaw.maxY = y;
                if(Macaw.minX > x) Macaw.minX = x;
                if(Macaw.minY > y) Macaw.minY = y;

            }
            if (p==2) {
                flock.add(new Penguin((Names.libForPings.names[(int)(( Math.random() * (6)))]),x,y));
                if(Penguin.maxX<x) Penguin.maxX=x;
                if(Penguin.maxY<y) Penguin.maxY=y;
                if(Penguin.minX>x) Penguin.minX=x;
                if(Penguin.minY>y) Penguin.minY=y;
            }
            if (p==3){
                flock.add(new Vorobey((Names.libForVors.names[(int)(( Math.random() * (6)))]),x,y));
                if(Vorobey.maxX<x) Vorobey.maxX=x;
                if(Vorobey.maxY<y) Vorobey.maxY=y;
                if(Vorobey.minX>x) Vorobey.minX=x;
                if(Vorobey.minY>y) Vorobey.minY=y;
            }
        }

        int[] parsingMaxX = {Macaw.maxX,Penguin.maxX,Vorobey.maxX};
        for(int i = 0; i < 3; i++){
            if(parsingMaxX[i]>finMaxX){
                finMaxX=parsingMaxX[i] ;
            }
        }
        System.out.println("finMaxX"+finMaxX);

        int[] parsingMaxY={Macaw.maxY,Penguin.maxY,Vorobey.maxY};
        for(int i = 0; i < 3; i++){
            if(parsingMaxY[i]>finMaxY) {
                finMaxY = parsingMaxY[i];
            }
        }
        System.out.println("finMaxY"+finMaxY);
        int[] parsingMinX={Macaw.minX,Penguin.minX,Vorobey.minX};
        for(int i = 0; i < 3; i++){
            if(parsingMinX[i]<finMinX) {

                finMinX = parsingMinX[i];
            }
        }
        System.out.println("finMinX"+finMinX);
        int[] parsingMinY={Macaw.minY,Penguin.minY,Vorobey.minY};
        for(int i = 0; i < 3; i++){
            if(parsingMinY[i]<finMinY) {
                finMinY = parsingMinY[i];

            }
        }
        System.out.println("finMinY" + finMinY);

    }


    public void draw(Graphics g){
        for(int i=0; i< flock.size();i++){
            flock.get(i).draw(g);
            System.out.println(" Рисую ");
            if (Macaw.maxX!=0 && Macaw.maxY!=0) {
                g.setColor(Color.GREEN);
                System.out.println("Macaw: " + Macaw.minX + " " + Macaw.minY + " " + Macaw.maxX + " " + Macaw.maxY);
                g.drawRect(Macaw.minX, Macaw.minY, Macaw.maxX - Macaw.minX + 60, Macaw.maxY - Macaw.minY + 60);
            }
            if (Penguin.maxX!=0 && Penguin.maxY!=0) {
                System.out.println("Penguin: " + Penguin.minX + " " + Penguin.minY + " " + Penguin.maxX + " " + Penguin.maxY);
                g.setColor(Color.BLUE);
                g.drawRect(Penguin.minX, Penguin.minY, Penguin.maxX - Penguin.minX + 50, Penguin.maxY - Penguin.minY + 50);
            }
            if (Vorobey.maxX!=0 && Vorobey.maxY!=0) {

                System.out.println("Vorobey: " + Vorobey.minX + " " + Vorobey.minY + " " + Vorobey.maxX + " " + Vorobey.maxY);
                g.setColor(Color.GRAY);
                g.drawRect(Vorobey.minX, Vorobey.minY, Vorobey.maxX - Vorobey.minX + 40, Vorobey.maxY - Vorobey.minY + 40);
            }
            if (finMaxX!=0 && finMaxY!=0){
                g.setColor(Color.pink);
                g.drawRect(finMinX,finMinY,finMaxX-finMinX+50,finMaxY-finMinY+50);
            }
            System.out.println("Произошла отрисовка");

        }

    }
    public boolean localXY(int x, int y){
        for (int i = 0; i < flock.size(); i++) {
            if(x >= flock.get(i).x  && x <= flock.get(i).x  && y >= flock.get(i).y  && y <= flock.get(i).y ) return true;
        }
        return false;
    }



}