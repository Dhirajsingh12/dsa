
public class TicketBooking implements Runnable {

    private static int availableTickets = 10;
    private String user;
    private int ticketsRequested;

    // Constructor
    public TicketBooking(String user, int ticketsRequested) {
        this.user = user;
        this.ticketsRequested = ticketsRequested;
    }

    // Run method for thread execution
    public void run() {
        synchronized (TicketBooking.class) {
            System.out.println(user + " is trying to book " + ticketsRequested + " ticket(s)...");

            if (availableTickets >= ticketsRequested) {
                System.out.println(user + " booking confirmed for " + ticketsRequested + " ticket(s).");
                availableTickets -= ticketsRequested;

                try {
                    Thread.sleep(1000); // Simulate processing delay
                } catch (InterruptedException e) {
                    System.out.println("Booking interrupted for " + user);
                }
            } else {
                System.out.println("Sorry " + user + ", not enough tickets available (Requested: " + ticketsRequested + ", Available: " + availableTickets + ")");
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TicketBooking("Alice", 4));
        Thread t2 = new Thread(new TicketBooking("Bob", 2));
        Thread t3 = new Thread(new TicketBooking("Charlie", 5));
        Thread t4 = new Thread(new TicketBooking("Diana", 1));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("\nTickets remaining: " + availableTickets);
    }
}
