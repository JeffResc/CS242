import java.awt.Point;
public class ClassCountdown {   
     private int countdown = 10;
     private Point enableUpdateReset = new Point(0,0);

     public void resetCountdown() {
          synchronized(enableUpdateReset) {
        	  System.out.println("hi");
          }               
     }
     public void updateCountdown() {
          synchronized(enableUpdateReset) {          
               System.out.println("hi2");
          }
     }
     public static void main(String[] args) {
        Thread tA = new Thread( );
 		Thread tB = new Thread( );
 		tA.start();
 		tB.start();
      }
}