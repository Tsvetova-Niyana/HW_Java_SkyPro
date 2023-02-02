package pro.sky.java.course1.hw12ObjectsAndClasses;
/*
Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги. Типы полей
должны быть String, Author (его мы создадим в п. 2) и int.

Напишите конструкторы для обоих классов, заполняющие все поля.
Создайте геттеры для всех полей автора и всех полей книги.
Создайте сеттер для поля «Год публикации» у книги.
 */

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

    public Author getnameAuthor() {
        return this.nameAuthor;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }
}
