package pro.sky.java.course1.hw12ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        /*
        Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.

        Обратите внимание, что toString книги не должен дублировать код из toString автора,
        а должен делегировать (вызывать) его версию метода.
         */
        Author authorTolstoy = new Author("Лев", "Толстой");
        System.out.println(authorTolstoy);
        Author authorLTolstoy = new Author("Лев", "Толстой");
        System.out.println(authorLTolstoy);
        Author authorATolstoy = new Author("Алексей", "Толстой");
        System.out.println(authorATolstoy);

        Author authorDuma = new Author("Александр", "Дюма");
        System.out.println(authorDuma);

        Author authorTurgenev = new Author("Иван", "Тургенев");
        System.out.println(authorTurgenev);
        System.out.println();

        Book bookWarAndPeace = new Book("Война и мир", authorTolstoy, 1986);
        System.out.println(bookWarAndPeace);
        System.out.println();

        Book bookCountMonteCristo = new Book("Граф Монте-Кристо", authorDuma, 2017);
        System.out.println(bookCountMonteCristo);
        System.out.println();

        Book countMonteCristo = new Book("Граф Монте-Кристо", authorDuma, 2017);
        System.out.println(bookCountMonteCristo);
        System.out.println();

        Book bookFathersAndChildren = new Book("Отцы и дети", authorTurgenev, 2002);
        System.out.println(bookFathersAndChildren);
        System.out.println();

        Book fathersAndChildren = new Book("Отцы и дети", authorTurgenev, 2012);
        System.out.println(bookFathersAndChildren);
        System.out.println();

        bookWarAndPeace.setPublisherYear(2006);
        System.out.println(bookWarAndPeace);
        System.out.println();

        System.out.println("Сравнение авторов authorTolstoy и authorLTolstoy (один и тот же автор)");
        System.out.println(authorTolstoy.equals(authorLTolstoy));
        System.out.println();

        System.out.println("Сравнение авторов authorTolstoy и authorATolstoy (разные авторы)");
        System.out.println(authorTolstoy.equals(authorATolstoy));
        System.out.println();

        System.out.println("Сравнение книг bookCountMonteCristo и countMonteCristo (полностью идентичные издания )");
        System.out.println(bookCountMonteCristo.equals(countMonteCristo));
        System.out.println();

        System.out.println("Сравнение книг bookWarAndPeace и bookCountMonteCristo (разные издания)");
        System.out.println(bookWarAndPeace.equals(bookCountMonteCristo));
        System.out.println();

        System.out.println("Сравнение книг bookFathersAndChildren и fathersAndChildren (разные года издания)");
        System.out.println(bookFathersAndChildren.equals(fathersAndChildren));
        System.out.println();

        System.out.println("hashCode книг:");
        System.out.println("- " + bookWarAndPeace.getBookName() + ": " + bookWarAndPeace.hashCode());
        System.out.println("- " + bookFathersAndChildren.getBookName() + ": "
                + bookFathersAndChildren.hashCode());
        System.out.println("- " + fathersAndChildren.getBookName() + ": " + fathersAndChildren.hashCode());
        System.out.println("- " + bookCountMonteCristo.getBookName() + ": "
                + bookCountMonteCristo.hashCode());
        System.out.println("- " + countMonteCristo.getBookName() + ": " + countMonteCristo.hashCode());
        System.out.println();

        System.out.println("hashCode авторов:");
        System.out.println("- " + authorTolstoy + ": " + authorTolstoy.hashCode());
        System.out.println("- " + authorLTolstoy + ": " + authorLTolstoy.hashCode());
        System.out.println("- " + authorATolstoy + ": " + authorATolstoy.hashCode());
        System.out.println("- " + authorDuma + ": " + authorDuma.hashCode());
        System.out.println("- " + authorTurgenev + ": " + authorTurgenev.hashCode());
    }
}
