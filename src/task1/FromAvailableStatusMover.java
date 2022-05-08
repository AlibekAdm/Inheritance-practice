package task1;

public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED:
                System.out.println("Запрос обработан: " + requestedStatus);
                book.setStatus(Status.ARCHIVED);
                break;
            case BORROWED:
                System.out.println("Запрос обработан: " + requestedStatus);
                book.setStatus(Status.BORROWED);
                break;
            case OVERDUE:
                System.out.println("Запрос обработан: " + requestedStatus);
                break;
        }
    }
}