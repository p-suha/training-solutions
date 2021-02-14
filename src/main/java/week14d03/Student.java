package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student> {

    private Map<String, List<Integer>> studentsGrad = new HashMap<>();
    private String nameOfStudent;

    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public Map<String, List<Integer>> getStudentsGrad() {
        return studentsGrad;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }


    public void addGrade(String subject, int grade) {
        if (!studentsGrad.containsKey(subject)) {
            studentsGrad.put(subject, new ArrayList<>());
        }
        studentsGrad.get(subject).add(grade);

    }

    @Override
    public int compareTo(Student o) {
        return nameOfStudent.compareTo(o.nameOfStudent);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentsGrad=" + studentsGrad +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                '}';
    }
}
