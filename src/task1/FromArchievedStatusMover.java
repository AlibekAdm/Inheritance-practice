package task1;

public class FromArchievedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED:
                System.out.println("Запрос обработан: " + requestedStatus);
                book.setStatus(Status.ARCHIVED);
                break;
            default:
                book.setStatus(Status.ARCHIVED);
                System.out.printf("Перевод книги из статуса" + requestedStatus + " невозможен");
        }
    }
}