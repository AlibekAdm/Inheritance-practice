package task1;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED:
                System.out.println("Запрос обработан: " + requestedStatus);
                book.setStatus(Status.ARCHIVED);
                break;
            case OVERDUE:
                System.out.println("Запрос обработан: " + requestedStatus);
                book.setStatus(Status.OVERDUE);
                break;
            default:
                book.setStatus(Status.BORROWED);
                System.out.printf("Перевод книги из статуса" + requestedStatus + " невозможен");
        }
    }
}