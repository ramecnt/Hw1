import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void registration(String login, String password, String confirmPassword) {
        try {
            boolean valid = login.matches("\\w+");
            if (!valid || login.length() > 20) {
                throw new WrongLoginException("Логин содержит в себе только латинские буквы, цифры и знак подчеркивания, длина не должна превышать 20 символов");
            }
            boolean valid2 = password.matches("\\w+");
            boolean valid3 = confirmPassword.equals(password);
            if (!valid2 || password.length() > 20 || !valid3) {
                throw new WrongLoginException("Пароль содержит в себе только латинские буквы, цифры и знак подчеркивания, длина не должна превышать 20 символов, пароли должны совпадать");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        registration("lol1_", "lol", "lol");
    }
}