package pro.sky.java.course1.hw12ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        /*
        Напишите небольшой библиотечный справочник, где хранится информация о книгах.

        Рекомендуем создать отдельный класс, например с именем Main или App — в нем объявить метод main и в нем
        протестировать работу вашего кода.

        Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги. Типы полей
        должны быть String, Author (его мы создадим в п. 2) и int.
        Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
        Напишите конструкторы для обоих классов, заполняющие все поля.
        Создайте геттеры для всех полей автора и всех полей книги.
        Создайте сеттер для поля «Год публикации» у книги.
        В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно
        тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться
        без авторов.
        Метод main не должен находиться в классах Book и Author.

        Создайте отдельный класс для запуска приложения и объявите метод main в нем.

        В том же методе main измените год публикации одной из книг с помощью сеттера.
        Так как вы изучили геттеры и сеттеры, оставлять поля открытыми, без модификатора доступа private, недопустимо.
         */
        Author author1 = new Author("Лев Толстой");
        System.out.println(author1.getNameAuthor());

        Author author2 = new Author("Александр Дюма");
        System.out.println(author2.getNameAuthor());

        Author author3 = new Author("Иван Тургенев");
        System.out.println(author2.getNameAuthor());

        Book book1 = new Book("Война и мир", author1.getNameAuthor(), 1986);
        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.nameAuthor = " + book1.getnameAuthor());
        System.out.println("book1.publisherYear = " + book1.getPublisherYear());

        Book book2 = new Book("Граф Монте-Кристо", author2.getNameAuthor(), 2017);
        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.nameAuthor = " + book1.getnameAuthor());
        System.out.println("book1.publisherYear = " + book1.getPublisherYear());

        Book book3 = new Book("Отцы и дети", author3.getNameAuthor(), 2002);
        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.nameAuthor = " + book1.getnameAuthor());
        System.out.println("book1.publisherYear = " + book1.getPublisherYear());
    }
}
