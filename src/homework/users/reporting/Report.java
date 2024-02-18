package homework.users.reporting;

import homework.users.User;

public class Report implements Reporter{

    @Override
    public void report(User user) {
        System.out.println("Отчет для пользователя: " + user.getName());
    }
}
