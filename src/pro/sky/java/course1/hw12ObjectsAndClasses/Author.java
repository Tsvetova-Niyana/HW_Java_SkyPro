package pro.sky.java.course1.hw12ObjectsAndClasses;
/*
Создайте класс Author, который содержит в себе данные об имени и фамилии автора.

Напишите конструкторы для обоих классов, заполняющие все поля.
Создайте геттеры для всех полей автора и всех полей книги.
 */

public class Author {
    private String nameAuthor;

    public Author(String nameAuthor) {
        this.nameAuthor = nameAuthor;
        }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

}
