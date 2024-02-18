package homework;

import homework.users.User;
import homework.users.Facade;
import homework.users.persistence.Persistence;
import homework.users.reporting.Report;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persistence persister = new Persistence();
        Report report = new Report();
        Facade facade = new Facade(persister, report);
        facade.report(user);
        facade.save(user);
    }
}