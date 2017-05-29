/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.awt.*;
import java.util.*;
/**
 *
 * @author prudvi
 */
public class Moving {
    FinalProject frame;
    public int position=0;
 
 
 public Moving(FinalProject fr){ frame = fr;}

 public void moving(int track, int x, int y){
     
     if(track == 1)moving_a1(track,x,y);
     if(track == 2)moving_a2(track,x,y);
     }
 
      public void moving_a1(int track, int x, int y){
     	
     go(track,x,y); 
        
    }
  public void moving_a2(int track, int x, int y){ 
     
     go(track,x,y);
     
  }
  public void go(int track, int x, int y){
   	   if((track == 1)){
                
           while (x< 800){ 
                    double j = (double) Math.random();
                    if (x < 50)
                  x=50;
                    if(j <= 0.5 && position == 0)      
                        x = x+30;                          //fast plod(2 positions)
                    if(j > 0.5 && j<=0.7 && position == 0) 
                        x = x-60;                           //slip(4 positions)
                    if(j>0.7 && j <=1 && position == 0)
                        x = x+15;                            //slow plod(1 position)
                    if (x >= 800)
                        position=1;
                    frame.sm(x,y,track,position);
                         try{
                            
                              Thread.sleep(200);
                               
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
                         }
                

                } //end if

        if(track == 2){
            
            while (x< 800){ 
                    double j = (double) Math.random();
                     if (x < 50)
                    x=50;
                     
                     if(j>=0.0 && j<=0.2 && position == 0)
                        x=x+0;                                 //sleep(no move at all)
                     if(j>0.2 && j<=0.4 && position == 0)
                        x =x+105;                              //bighop(7 positions to the right)
                     if(j>0.4 && j<=0.5 && position == 0)
                         x = x-150;                            //bigslip(10 positions to the left)
                     if(j>0.5 &&j<=0.8 && position == 0 )
                         x = x+15;                             //small hop(1 position to the right)
                     if(j>0.8 && j<=1&& position == 0)
                         x = x-30;                             //small slip(2 positions to the left)
                     
                         if (x >= 800)
                                position=1;
                         frame.sm(x,y,track,position);
                         
                         try{
                             Thread.sleep(200);
                             }
                        
                         catch(Exception e)
                            {System.err.println("Exception");}
                        
            }
           
           
       }//end if

       
     }//end go
   
   }


