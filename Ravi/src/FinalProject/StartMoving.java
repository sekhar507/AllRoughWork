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
public class StartMoving {
    public int status=0;
    TestProject frame;
 
   


 public StartMoving(TestProject fr){ frame = fr;}

 public void startmoving(int choice, int x, int y){
     

     if(choice == 1)startmoving_a1(choice,x,y);
     if(choice == 2)startmoving_a2(choice,x,y);
     
     }
 
      public void startmoving_a1(int choice, int x, int y){
     	

     	go(choice,x,y); 
     	
     }
  public void startmoving_a2(int choice, int x, int y){ 
  
     go(choice,x,y);
  }
  public void go(int choice, int x, int y){
   	   if((choice == 1)){


                while (x< 555){ 
                    double r = (double) Math.random();
                    if(r <= 0.5 && status == 0){
                      System.out.println("Fast plod");  
                        x = x+2;
                    }
                        
                    else if(r > 0.5 && r<=0.7 && status == 0){
                      System.out.println("Slip");  
                        x = x-4;
                    }
                    else if(r>0.7 && r <=1 && status == 0){
                      System.out.println("Slow plod");  
                        x = x+1;
                    }
                    
                    frame.sm(x,y,choice);
                         try{
                               Thread.sleep(100);
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
                         }
                if (x >= 555)
                 status =1;

                } //end if

        if(choice == 2){
                
            while (x< 555){ 
                    double r = (double) Math.random();
                     
                     if(r>0.2 && r<=0.4 && status == 0){
                        System.out.println("Big Hop");  
                        x =x+7;
                     }
                     else if(r>0.4 && r<=0.5 && status == 0){
                        System.out.println("Big Slip"); 
                         x = x-10;
                     }
                     else if(r>0.5 &&r<=0.8 && status == 0 ){
                        System.out.println("Small Hop");
                         x = x+1;
                     }
                     else if(r>0.8 && r<=1&& status == 0){
                        System.out.println("Small Slip"); 
                         x = x-2;
                     }
                     
                        frame.sm(x,y,choice);
                         try{
                               Thread.sleep(100);
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
                        
            }

            if (x >= 555)
                status =1;
                 }//end if

       
        }//end go
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
}
