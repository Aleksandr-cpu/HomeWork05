package homework.users.persistence;

import homework.users.User;

public class Persistence implements Saver {

    @Override
    public void save(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        System.out.println("Пользователь " + user.getName() + " сохранен");
    }
}
