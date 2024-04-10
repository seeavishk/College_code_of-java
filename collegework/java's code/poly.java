//applet is too a program but the difference is that it runs on the web browser

//SO FOR MY UNDERSTANDING HERE IS THE IMPLEMENTATION OF THE APPLET TO CREATE A POLYGON ON THE WEB 

import java.awt.*;
import javax.swing.*;

public class poly extends Japplet{
    public void init(){
        setSize(200,200);
        show();
    }
    public void start()
}

public: void stop(){

}
public void paint(Graphics g){
    int x[]={10,30,40,50,110,140};
    int y[]={140,110,50,40,30,10};

    int numberOfPoints =6;
    g.getColor(Color.blue);
    g.drawPolygon(x, y, numberOfPoints);
}