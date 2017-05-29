/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author prudvi
 */
public class FinalProject extends JFrame {

    /**
     * @param args the command line arguments
     */
      private boolean lock_a = true;	
      private boolean lock_b = true;

    int a1_x = 0;
  	int a1_y = 120;
  	
  	int a2_x = 0;
  	int a2_y = 180;
  	String s_a1 = "";
  	String s_b1 = "";
  	Display display;
  	Button start1;
        Moving mov;
        
        
        public FinalProject()
        {
            setTitle("RACE");
		  setSize(1000, 350);
  	 mov = new Moving(this);

		  
		  addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e)
		  { System.exit(0); }
	      });
      
      Container contentPane = getContentPane();
      getContentPane().setLayout(new BorderLayout());

  	 	display = new Display(); 
   		contentPane.add(BorderLayout.CENTER, display);
   		Panel p = new Panel(); 
   		start1 = new Button("start"); 
   		p.add(start1);
   		contentPane.add(BorderLayout.SOUTH, p);
   		
   		
		Handler handler = new Handler();
   		start1.addActionListener(handler);
   		
        }
ImageIcon tortoise = new ImageIcon("tortoise.gif");
ImageIcon hare = new ImageIcon("hare.gif");
ImageIcon carrot = new ImageIcon("carrot.gif");

class Display extends Canvas{

	public void paint(Graphics g)
   	
   	{
            
     	g.drawLine(50,170,800,170);
        
        for(int i=50;i<=850;i+=15){
            
            
        g.drawLine(i, 168, i, 152);
        }
     	
     	g.drawLine(50,150,800,150);
       
        tortoise.paintIcon(this, g, a1_x, a1_y); 
        hare.paintIcon(this, g, a2_x, a2_y);
        carrot.paintIcon(this,g,800,130);
        g.drawString(s_a1, 10,10);
     	g.drawString(s_b1, 10, 50);
     	
   }
}
public synchronized void sm(int x, int y, int track, int position)
       	{
            if(track == 1)
            {
                while (!lock_a){
                    try{
                          wait();
                        }
                    catch(InterruptedException e)
                       {System.out.println("Interrupted Exception"); }

                 }
                    lock_a = false;
		    notifyAll();
             	a1_x = x;
             	a1_y = y;
            if (a1_x>=800 && position==1){
                       s_a1 = "Tortoise won";
            }
                 else
            {
                if(position!=1)
                    s_a1 = "Tortoise  at "+a1_x+" and "+a1_y;
                else 
                    s_a1 = "Tortoise Lost"; 
            }
             lock_a=true;
             notifyAll();
              try{
                            
                               Thread.sleep(500);   
                               
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
				
	}

            if(track == 2){
                while (!lock_b && lock_a){
                try{
                      wait();
                    }
                catch(InterruptedException e)
                   {System.out.println("Interrupted Exception"); }
                }
                        notifyAll();
                lock_b = false;    
             	a2_x = x;
             	a2_y = y;
                   if (a2_x >=800 && position==1)
                   {
                   	   s_b1 = "Hare won";
                   }
                    else
         			       
                   {
                       if(position!=1)
                       s_b1 = "Hare  at "+a2_x+" and "+a2_y;
                       else
                         s_b1 = "Hare Lost"; 
                   }
                   lock_b=true;
                   notifyAll();
                   try{
                            
                               Thread.sleep(500);
                               
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
                         
                 }
               	display.repaint();

           }



    public static void main(String[] args) {
       // TODO code application logic here
        FinalProject theFrame = new FinalProject();
	theFrame.show();
        
    }
    class Handler implements ActionListener{
	

	public void actionPerformed(ActionEvent e)
         {

         	  if (e.getSource() == start1)
                {
                  Race r1 = new Race(1,mov);
                  r1.start();
                  
             
                   Race r2 = new Race(2,mov);
                   r2.start();
             
                }
            
         }
    } 
    
}
