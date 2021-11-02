package practice.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws User.NoSuchUserException {
        UserService userService = new UserService();
        Scanner sc = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("1. Add new user");
            System.out.println("2. Remove existing user");
            System.out.println("3. Check is user present");
            System.out.println("4. Change login of existing user");
            System.out.println("5. Change password of existing user");

            String choice = sc.nextLine();
            String login;

            switch (choice) {
                case "1" :
                    login = getStrFromConsole("Enter login:");
                    String password = getStrFromConsole("Enter password:");
                    userService.userAdd(login, password);
                    break;
                case "2" :
                    login = getStrFromConsole("Enter login:");
                    userService.userDelete(login);
                    break;
                case "3" :
                    login = getStrFromConsole("Enter login:");
                    System.out.println(userService.isUserPresence(login));
                    break;
                case "4" :
                    login = getStrFromConsole("Enter login:");
                    String newLogin = getStrFromConsole("Enter new login:");
                    userService.changeUserLogin(login, newLogin);
                    break;
                case "5" :
                    login = getStrFromConsole("Enter login:");
                    String newPass = getStrFromConsole("Enter new pass:");
                    userService.changeUserPassword(login, newPass);
                    break;
                default:
                    System.out.println("Exit program");
                    break loop;
            }
            userService.showAllUsers();
        }
    }

    private static String getStrFromConsole(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }
}
