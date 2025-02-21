package esercizi_compito.week5.pp_dc_rs;

import java.util.ArrayList;
import java.util.Date;

/*
{
    "isbn": "978-88-6198-029-1",
    "borrowHistory": ArrayList[
        {
            "user": {
                "name": "John",
            },
            "book": {
                "title": "Java Programming",
                "author": "John Doe",
                .
                .
                .
            },
            "borrowDate": "2024-03-01",
            "returnDate": "2024-03-15"
        },
        .
        .
        .
    ]
}
 */
public class LibraryBookBorrowHistory {
    public ArrayList<LibraryBookBorrowHistoryEntry> borrowHistory;
    private static LibraryBookBorrowHistory instance = null;

    public LibraryBookBorrowHistory() {
        this.borrowHistory = new ArrayList<>();
    }

    public void addBorrowEntry(LibraryBookBorrowHistoryEntry entry) {
        borrowHistory.add(entry);
    }

    public ArrayList<LibraryBookBorrowHistoryEntry> getBookHistory(String isbn) {
        ArrayList<LibraryBookBorrowHistoryEntry> bookHistory = new ArrayList<>();
        for (LibraryBookBorrowHistoryEntry entry : borrowHistory) {
            if (entry.getBook().getIsbn().equals(isbn)) {
                bookHistory.add(entry);
            }
        }
        return bookHistory;
    }

    // create a singleton instance of LibraryBookBorrowHistory

    public static LibraryBookBorrowHistory getInstance() {
        if (instance == null) {
            instance = new LibraryBookBorrowHistory();
        }
        return instance;
    }

    // print all the borrow history
    public void printBorrowHistory() {
        for (LibraryBookBorrowHistoryEntry entry : borrowHistory) {
            System.out.println(entry);
        }
    }


    public ArrayList<LibraryBookBorrowHistoryEntry> getBorrowHistoryEntry(User user, Book book, boolean isReturned) {
        ArrayList<LibraryBookBorrowHistoryEntry> history = new ArrayList<>();
        for (LibraryBookBorrowHistoryEntry entry : borrowHistory) {
            if (entry.getUser().equals(user) && entry.getBook().equals(book) && entry.isReturned() == isReturned) {
                history.add(entry);
            }
        }
        return history;
    }

    public ArrayList<LibraryBookBorrowHistoryEntry> getBorrowHistoryEntry(User user, Book book) {
        ArrayList<LibraryBookBorrowHistoryEntry> history = new ArrayList<>();
        history.addAll(getBorrowHistoryEntry(user, book, true));
        history.addAll(getBorrowHistoryEntry(user, book, false));
        return history;
    }
}
