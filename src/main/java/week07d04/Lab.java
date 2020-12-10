package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private LocalDate completeAt;
    private boolean completed;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completeAt) {
        this.title = title;
        this.completeAt = completeAt;
        this.completed = true;
    }

    public void complete(LocalDate date) {
        this.completeAt = date;
        this.completed = true;
    }

    public void complete() {
        this.completeAt = LocalDate.now();
        this.completed = true;

    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completeAt=" + completeAt +
                ", completed=" + completed +
                '}';
    }

    public static void main(String[] args) {
        Lab labour = new Lab("Első lecke");
        Lab labour2 = new Lab("Második lecke lecke");
        Lab lab2 = new Lab("Harmadik lecke", LocalDate.parse("2020-10-10"));

        labour.complete(LocalDate.of(2020, 12, 01));
        labour2.complete();
        System.out.println(labour.toString());
        System.out.println(lab2.toString());
        System.out.println(labour2.toString());
    }
}
