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

    public void userDelete(String login) throws User.NoSuchUserException {
        User user = getUserByLogin(login);
        if (user != null)
            users.remove(user);
        else
            throw new User.NoSuchUserException();
    }

    public boolean isUserPresence(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) return true;
        }
        return false;
    }

    public void changeUserLogin(String login, String newLogin) throws User.NoSuchUserException {
        User user = getUserByLogin(login);
        if (user != null)
            users.set(
                    users.indexOf(user),
                    new User(newLogin, user.getPassword())
            );
        else
            throw new User.NoSuchUserException();
    }

    public void changeUserPassword(String login, String newPass) throws User.NoSuchUserException {
        User user = getUserByLogin(login);
        if (user != null)
            users.set(
                    users.indexOf(user),
                    new User(user.getLogin(), newPass)
            );
        else
            throw new User.NoSuchUserException();
    }

    private User getUserByLogin (String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) return user;
        }
        return null;
    }
}
