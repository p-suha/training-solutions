package schoolrecords;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public Random getRnd() {
        return rnd;
    }

    public List<Student> getStudents() {
        return students;
    }


    public String listStudentNames() {

        StringBuilder theList = new StringBuilder();
        for (Student item : getStudents()) {

            theList.append(item.getName() + ", ");
        }
        return theList.substring(0, theList.length() - 2);
    }

    //
    public boolean addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student nem lehet üres");
        }

        for (Student std : students) {
            if (std.getName().equals(student.getName())) {
                return false;
            }
        }
        return students.add(student);

    }

    public boolean removeStudent(Student student) {

        for (Student item : students) {
            if (item.getName().equals(student.getName())) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public Student findStudentByName(String name) {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }

        boolean findIt = false;
        for (Student student : students) {

            if (student.getName().equals(name)) {

                findIt = true;
                return student;
            }

        }
        if (!findIt) {

            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }

        return null;
    }

    public Student repetition() {

        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }

        return students.get(rnd.nextInt(students.size()));

    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> nameAndStudyResultList = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            nameAndStudyResultList.add(new StudyResultByName(students.get(i).calculateAverage(), (students.get(i).getName())));
        }

        return nameAndStudyResultList;
    }


    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double average = 0.0;

        for (Student stud : students) {

            if (stud.getMarks().isEmpty()) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            average = average + stud.calculateAverage();
        }

        DecimalFormat newformat = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
        return Double.valueOf(newformat.format(average / students.size()));

        //return Math.round((average / students.size()) *100) / 100.0;
    }

//
//    public double calculateClassAverageBySubject(Subject subject) {
//
//        List<Double> subjectAverage = new ArrayList<>();
//        for (Student s : students) {
//            if (s.calculateSubjectAverage(subject) > 0.0) {
//                subjectAverage.add(s.calculateSubjectAverage(subject));
//            }
//        }
//
//        double summa = 0.0;
//        for (Double d : subjectAverage) {
//            summa += d;
//        }
//
//        double average = summa / subjectAverage.size();
//        String s = Double.toString(average) + "0";
//        s = s.substring(0, 4);
//        average = Double.parseDouble(s);
//        return average;
//    }


    public double calculateClassAverageBySubject(Subject subject) {

        List<Double> subjectAverage = new ArrayList<>();

        for (Student item : students) {
            if (item.calculateSubjectAverage(subject) > 0.0) {

                subjectAverage.add(item.calculateSubjectAverage(subject));
            }
        }

        double sum = 0.0;
        for (Double itemAverage : subjectAverage) {
            sum = sum + itemAverage;
        }

        return ((sum / subjectAverage.size()) * 100) / 100.0;
    }

}


