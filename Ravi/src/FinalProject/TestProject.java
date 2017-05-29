/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalProject;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author ravi
 */
public class TestProject extends JFrame {

    /**
     * @param args the command line arguments
     */
    
        int x1 = 0;
  	int y1 = 120;
  	int x2 = 0;
  	int y2 = 180;
  	Display dis;
  	Button start;
        StartMoving move;
        
        
        public TestProject()
        {
            setTitle("Tortoise vs Hare");
		  setSize(700, 400);
  	 move = new StartMoving(this);

		  
		  addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e)
		  { System.exit(0); }
	      });
      
      Container contentPane = getContentPane();
      getContentPane().setLayout(new BorderLayout());

  	 	dis = new Display();
                Panel p = new Panel();
                start = new Button("start Race");
                p.add(start);
   		contentPane.add(BorderLayout.CENTER, dis);
   		contentPane.add(BorderLayout.SOUTH, p);
   		
   		Handler handler = new Handler();
   		start.addActionListener(handler);
   		
        }
ImageIcon turtle = new ImageIcon("t.gif");
ImageIcon rabbit = new ImageIcon("h.gif");
ImageIcon carrot = new ImageIcon("c.gif");

class Display extends Canvas{

	public void paint(Graphics g)
   	
   	{
   		
     	setBackground(Color.YELLOW);
         g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Race", 250,30);
        
        carrot.paintIcon(this,g,600,130);
        if(x1 <= 555)
            turtle.paintIcon(this, g, x1, y1); 
        if(x2 <= 555 )
            rabbit.paintIcon(this, g, x2, y2);
       
     	
   }
}
public void sm(int x, int y, int choice)
       	{
            if(choice == 1)
            {
             	x1 = x;
             	y1 = y;
            
                 
	}

            if(choice == 2){
             	x2 = x;
             	y2 = y;
                   
                 }
               	dis.repaint();

           }



    public static void main(String[] args) {
       
        TestProject theFrame = new TestProject();
	theFrame.show();
        // TODO code application logic here
    }
    class Handler implements ActionListener{
	

	public void actionPerformed(ActionEvent e)
         {

         	  if (e.getSource() == start)
                {
                  TortoiseHare t1 = new TortoiseHare(1,move);
                  t1.start();

             
                   TortoiseHare t2 = new TortoiseHare(2,move);
                   t2.start();
                }
            
         }
    } //end  handler
    
}
