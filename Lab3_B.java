public class Lab3_B {
    static class OrderProcessingThread extends Thread {
        private String orderId;

        OrderProcessingThread(String orderId) {
            this.orderId = orderId;
        }

        @Override
        public void run() {
            try {
                System.out.println(orderId + " : Order Validation");
                Thread.sleep(1000);

                System.out.println(orderId + " : Payment Processing");
                Thread.sleep(1000);

                System.out.println(orderId + " : Order Shipment");
                Thread.sleep(1000);

                System.out.println(orderId + " : Order Completed\n");
            } catch (InterruptedException e) {
                System.out.println(orderId + " interrupted");
            }
        }
    }



        public static void main(String[] args) {
            OrderProcessingThread o1 = new OrderProcessingThread("Order 1001");
            OrderProcessingThread o2 = new OrderProcessingThread("Order 1002");
            OrderProcessingThread o3 = new OrderProcessingThread("Order 1003");

            o1.start();
            o2.start();
            o3.start();
        }


}
