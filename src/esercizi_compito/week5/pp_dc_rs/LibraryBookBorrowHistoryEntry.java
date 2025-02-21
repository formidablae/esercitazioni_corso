package esercizi_compito.week5.pp_dc_rs;

import java.util.Date;

public class LibraryBookBorrowHistoryEntry {
    private User user;
    private LibraryBook book;
    private Date borrowDate;
    private Date returnDate;


    public LibraryBookBorrowHistoryEntry(User user, LibraryBook book, Date borrowDate) {
        this.user = user;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = null;
    }

    public LibraryBookBorrowHistoryEntry(User user, LibraryBook book, Date borrowDate, Date returnDate) {
        this.user = user;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public LibraryBook getBook() {
        return book;
    }

    public String toString() {
        if (returnDate == null) {
            return user.getName() + " borrowed " + book.getTitle() + " on " + borrowDate;
        } else {
            return user.getName() + " borrowed " + book.getTitle() + " on " + borrowDate + " and returned on " + returnDate;
        }
    }

    public User getUser() {
        return user;
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
