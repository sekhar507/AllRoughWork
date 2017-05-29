/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

/**
 *
 * @author prudvi
 */
public class Race extends Thread {
     private int x;
   private int y;
   private int track;
   Moving m;
   public Race(int ch, Moving m1 ){
   
           track = ch;
           m = m1;
           if(track == 1) {x = 50; y = 100;}
           if(track == 2) {x = 50; y = 180;}
           
            }
public void  run(){     
               m.moving(track,x,y);
            }
}
