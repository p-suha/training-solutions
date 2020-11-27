package schoolrecords;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if (isEmpTy(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        this.name = name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }


    public double calculateAverage() {
        double sum = 0.0;

        if (marks.size() != 0) {
            for (Mark item : marks) {
                sum += item.getMarkType().getRating();
            }
            double average = sum / marks.size();

            String s = Double.toString(average).substring(0, 4);

            return Double.parseDouble(s);
        }

        return sum;

    }

    public double calculateSubjectAverage(Subject subject) {
        List<Mark> temp = new ArrayList<>();
        for (Mark mark : marks) {

            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                temp.add(mark);
            }
        }

        if (temp.size() != 0) {

            double sum = 0;
            for (Mark item : temp) {
                sum += item.getMarkType().getRating();
            }

            double average = sum / temp.size();
            return average;
        }
        return 0.0;
    }


    @Override
    public String toString() {
        String studentName = name;
        for (Mark item : marks) {
            studentName = studentName + " marks: " + item.getSubject().getSubjectName() + ": " + item.toString();
        }
        return studentName;
    }

    private boolean isEmpTy(String str) {

        return str == null || str == "";
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
