package pro.sky.java.course1.hw12ObjectsAndClasses;
/*
Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.

Обратите внимание, что toString книги не должен дублировать код из toString автора,
а должен делегировать (вызывать) его версию метода.
 */

import java.util.Objects;

public class Book {
    private String bookName;
    private Author nameAuthor;
    private int publisherYear;

    public Book(String bookName, Author nameAuthor, int publisherYear) {
        this.bookName = bookName;
        this.nameAuthor = nameAuthor;
        this.publisherYear = publisherYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName + "\nАвтор: " + nameAuthor + "\nГод издания: " + publisherYear + " г.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;

        return Objects.equals(bookName, book.bookName) && Objects.equals(nameAuthor, book.nameAuthor)
                && publisherYear == book.publisherYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, nameAuthor, publisherYear);
    }
}
