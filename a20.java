import javax.swing.*;
import java.awt.*;
  
public class a20 extends Canvas
{  
      
    public void paint(Graphics g) 
{  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("C:\\Users\\bhanu\\OneDrive\\Pictures\\Screenshots\bb.jpg");  
        g.drawImage(i, 120,100,this);  
          
   }
        public static void main(String[] args) 
{  
        a20 m=new a20();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
 }