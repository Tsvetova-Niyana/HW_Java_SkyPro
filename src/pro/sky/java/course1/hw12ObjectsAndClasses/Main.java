package pro.sky.java.course1.hw12ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
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
        Author authorTolstoy = new Author("Лев", "Толстой");
        System.out.println(authorTolstoy.getNameAuthor());

        Author authorDuma = new Author("Александр", "Дюма");
        System.out.println(authorDuma.getNameAuthor());

        Author authorTurgenev = new Author("Иван", "Тургенев");
        System.out.println(authorTurgenev.getNameAuthor());
        System.out.println();

        Book bookWarAndPeace = new Book("Война и мир", authorTolstoy, 1986);
        System.out.println("book1.bookName = " + bookWarAndPeace.getBookName());
        System.out.println("book1.nameAuthor = " + bookWarAndPeace.getNameAuthor().getNameAuthor() + " " +
                bookWarAndPeace.getNameAuthor().getSonameAuthor());
        System.out.println("book1.publisherYear = " + bookWarAndPeace.getPublisherYear());
        System.out.println();

        Book countMonteCristo = new Book("Граф Монте-Кристо", authorDuma, 2017);
        System.out.println("book1.bookName = " + countMonteCristo.getBookName());
        System.out.println("book1.nameAuthor = " + countMonteCristo.getNameAuthor().getNameAuthor()+ " " +
                countMonteCristo.getNameAuthor().getSonameAuthor());
        System.out.println("book1.publisherYear = " + countMonteCristo.getPublisherYear());
        System.out.println();

        Book fathersAndChildren = new Book("Отцы и дети", authorTurgenev, 2002);
        System.out.println("book1.bookName = " + fathersAndChildren.getBookName());
        System.out.println("book1.nameAuthor = " + fathersAndChildren.getNameAuthor().getNameAuthor()+ " " +
                fathersAndChildren.getNameAuthor().getSonameAuthor());
        System.out.println("book1.publisherYear = " + fathersAndChildren.getPublisherYear());
        System.out.println();

        bookWarAndPeace.setPublisherYear(2006);
        System.out.println("book1.bookName = " + bookWarAndPeace.getBookName());
        System.out.println("book1.nameAuthor = " + bookWarAndPeace.getNameAuthor().getNameAuthor()+ " " +
                bookWarAndPeace.getNameAuthor().getSonameAuthor());
        System.out.println("book1.publisherYear = " + bookWarAndPeace.getPublisherYear());
    }
}
