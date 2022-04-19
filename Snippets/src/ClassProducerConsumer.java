import java.lang.Thread;

public class ClassProducerConsumer {
     private boolean consumed = false;
     private String consumedItem;
     public synchronized void produce(String consumedItem) {
    	 System.out.println("product1 = " + consumed);
    	 consumed = true;
          System.out.println("product2 = " + consumed);
          /*while ( !consumed ) {
               // producer is making item to consume
          }
          this.consumedItem = consumedItem;*/
     }

     public synchronized String consume() {
    	 System.out.println("consume1 = " + consumed);
          consumed = false;
          System.out.println("consume2 = " + consumed);
          /*while ( consumed ) {
               // consumer is consuming item
          }
          return consumedItem;*/
      }

      public static void main(String[] args) {
        Thread tA = new Thread( );
		Thread tB = new Thread( );
		tA.start();
		tB.start();
     }
}