package dip1.model.util;

import dip1.model.ReportItem;

import java.util.Collection;
import java.util.List;

public class ReportPrinter implements ReportManager{
    @Override
    public void output(Collection<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
