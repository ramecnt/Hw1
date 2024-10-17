import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.Objects;

public class Main {
    public static boolean check(String word, String input) {
        if (word.matches("\\w+") && word.length() <= 20) {
            return true;
        } else if (Objects.equals(input, "логин")) {
            throw new WrongLoginException("Логин содержит в себе только латинские буквы, цифры и знак подчеркивания, длина не должна превышать 20 символов");
        } else {
            throw new WrongPasswordException("Пароль содержит в себе только латинские буквы, цифры и знак подчеркивания, длина не должна превышать 20 символов");
        }
    }

    public static void registration(String login, String password, String confirmPassword) {
        boolean valid = false;
        boolean valid2 = false;
        boolean valid3 = false;
        try {
            valid = check(login, "логин");
            valid2 = check(password, "пароль");
            valid3 = confirmPassword.equals(password);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            if (valid && valid2 && valid3) {
                System.out.println("Все корректно");
            } else {
                System.out.println("Попробуйте снова");
            }
        }
    }

    public static void main(String[] args) {
        registration("lol1_", "lal", "lol");
    }
}