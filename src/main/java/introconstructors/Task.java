package introconstructors;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String desc;
    private LocalDateTime startDateTime;
    private double duration;

    public Task(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String printAll(){
        return title + "- " + desc +" || kezdés: " + this.getStartDateTime() + " || időtartam: " + getDuration();
    }
    public void start() {

        startDateTime = LocalDateTime.now();
    }
    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


    public static void main(String[] args) {

    Task task = new Task("Első" , "ez az első teendő");

        System.out.println("Példányosítás után, nincs megadva duration és startdate");
        System.out.println(task.getTitle() + " - " + task.getDesc() + " - " + task.getDuration() + " / " + task.getStartDateTime());

        System.out.println("metódusokkal beállítjuk a kezdést és az időtartamot");
        task.start();
        task.getStartDateTime();
        task.setDuration(60);

        System.out.println(task.printAll());

    }
}