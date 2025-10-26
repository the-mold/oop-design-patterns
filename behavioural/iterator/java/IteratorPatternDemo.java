import java.util.Iterator;
import java.util.NoSuchElementException;

// A simple class we want to iterate over
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// 1. The Aggregate Interface (using Java's Iterable)
interface BookCollection extends Iterable<Book> {
    // The createIterator() method is implicitly required by Iterable
}

// 2. The ConcreteAggregate
class BookLibrary implements BookCollection {
    private Book[] books;
    private int bookCount = 0;

    public BookLibrary(int capacity) {
        books = new Book[capacity];
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        }
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books, bookCount);
    }

    // 3. The ConcreteIterator (as a private inner class)
    private class BookIterator implements Iterator<Book> {
        private Book[] books;
        private int size;
        private int currentIndex = 0;

        public BookIterator(Book[] books, int size) {
            this.books = books;
            this.size = size;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size && books[currentIndex] != null;
        }

        @Override
        public Book next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return books[currentIndex++];
        }
    }
}

// 4. The Client
public class IteratorPatternDemo {
    public static void main(String[] args) {
        BookLibrary library = new BookLibrary(5);
        library.addBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software"));
        library.addBook(new Book("Clean Code"));
        library.addBook(new Book("The Pragmatic Programmer"));

        // The client uses the iterator to traverse the collection
        // without knowing its internal structure (the array).
        System.out.println("Library Books:");
        for (Book book : library) {
            System.out.println("- " + book.getTitle());
        }
    }
}