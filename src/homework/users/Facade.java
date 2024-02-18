package homework.users;


import homework.users.persistence.Persistence;
import homework.users.reporting.Report;

public class Facade {
    private Persistence persister;
    private Report report;

    public Facade(Persistence persister,Report report) {
        this.persister = persister;
        this.report = report;
    }


    public void save(User user) {
        persister.save(user);
    }


    public void report(User user) {
        report.report(user);
    }
}
