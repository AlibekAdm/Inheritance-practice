package task1;

public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE:
                System.out.println("Запрос обратботан" + requestedStatus);
                book.setStatus(Status.AVAILABLE);
                book.setStatus(Status.ARCHIVED);
                break;
            case ARCHIVED:
                System.out.println("Запрос обратботан" + requestedStatus);
                book.setStatus(Status.ARCHIVED);
                break;
            default:
                book.setStatus(Status.OVERDUE);
                System.out.printf("Перевод книги из статуса" + requestedStatus + " невозможен");
        }
    }
}