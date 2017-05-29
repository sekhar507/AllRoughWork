/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalProject;

/**
 *
 * @author ravi
 */
public class TortoiseHare extends Thread {
     private int x;
   private int y;
   private final int choice;
   StartMoving m;
   public TortoiseHare(int ch, StartMoving m1 ){
   
           choice = ch;
           m = m1;
           if(choice == 1) {x = 50; y = 100;}
           if(choice == 2) {x = 50; y = 200;}
           
            }


   public void  run(){     

            m.startmoving(choice,x,y);
            }
}
