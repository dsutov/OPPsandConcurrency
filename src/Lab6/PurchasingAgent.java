package Lab6;

public class PurchasingAgent {

    public PurchasingAgent() {
        System.out.println("agent called");
    }

     public void purchase() {

		Store store = Store.getInstance();
        synchronized (store){
            System.out.println("Thread name: " + Thread.currentThread().getName() + " Thread ID: " + Thread.currentThread().getId());
            if(store.getShirtCount() > 0 && store.authorizeCreditCard("1234", 15.00)){
                Shirt shirt = store.takeShirt();

                System.out.println(shirt);
            } else {
                System.out.println("Failure to buy shirt");
            }
        }



    }
}