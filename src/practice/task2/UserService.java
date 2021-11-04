package practice.task2;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<User> users = new ArrayList<>();

    public void showAllUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void userAdd(String login, String password) {
        users.add(new User(login, password));
    }

    public void userDelete(String login) {
        User user = getUserByLogin(login);
        if (user != null)
            users.remove(user);
        else
            System.err.println("No such user");
    }

    public boolean isUserPresence(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) return true;
        }
        return false;
    }

    public void changeUserLogin(String login, String newLogin) {
        User user = getUserByLogin(login);
        if (user != null)
            users.set(
                    users.indexOf(user),
                    new User(newLogin, user.getPassword())
            );
        else
            System.err.println("No such user!");
    }

    public void changeUserPassword(String login, String newPass) {
        User user = getUserByLogin(login);
        if (user != null)
            users.set(
                    users.indexOf(user),
                    new User(user.getLogin(), newPass)
            );
        else
            System.err.println("No such user!");
    }

    private User getUserByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) return user;
        }
        return null;
    }
}
