package pro.sky.java.course1.hw12ObjectsAndClasses;
/*
Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
 */

import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String sonameAuthor;

    public Author(String nameAuthor, String sonameAuthor) {
        this.nameAuthor = nameAuthor;
        this.sonameAuthor = sonameAuthor;
        }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSonameAuthor() {
        return this.sonameAuthor;
    }

    @Override
    public String toString() {
        return nameAuthor + " " + sonameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(sonameAuthor, author.sonameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, sonameAuthor);
    }
}
