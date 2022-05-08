package task1;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Voina i Mir", Status.AVAILABLE);
        BookMover fromAvailableStatus = new FromAvailableStatusMover();
        fromAvailableStatus.moveToStatus(b1, Status.AVAILABLE);
        System.out.println(b1.getStatus());
    }
}