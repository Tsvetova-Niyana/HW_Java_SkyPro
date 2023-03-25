package workingWithExceptions;

import java.util.Objects;


/* Напишите статический метод, который принимает на вход три параметра: login, password и confirmPassword.
    Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания.
    У параметра login есть ограничение по длине – он должен быть равен или меньше 20 символов.
    Если login длиннее 20 символов, то необходимо выбросить исключение – WrongLoginException.

    Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания.
    У параметра password тоже есть ограничение по длине – он должен быть строго меньше 20 символов.
    Параметры password и confirmPassword должны быть равны.
    Если это требование не соблюдается, то нужно выбросить WrongPasswordException.

*/

public class Main {
    public static void main(String[] args) {
        boolean result = checkAuth("java_skyPro", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (result) {
            System.out.println("Авторизация пройдена");
        } else {
            System.out.println("Авторизация не пройдена");
        }


    }

    public static boolean checkAuth(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    public static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (Objects.isNull(login) || login.length() > 20) {
            throw new WrongLoginException("Login должен быть равен или меньше 20 символов");
        }

        if (Objects.isNull(password) || password.length() >= 20) {
            throw new WrongPasswordException("Password должен быть меньше 20 символов");
        }

        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Password и confirmPassword должны быть равны");
        }

        if (!login.matches("\\w+")) {
            throw new WrongLoginException("Login некорректен: Login содержит в себе только латинские буквы, " +
                    "цифры и знак подчеркивания");
        }

        if (!password.matches("\\w+")) {
            throw new WrongLoginException("Password некорректен: Password содержит в себе только латинские буквы, " +
                    "цифры и знак подчеркивания");
        }
    }
}
