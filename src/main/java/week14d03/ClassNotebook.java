package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNotebook {

    private List<Student> studentList;

    public ClassNotebook(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Student> sortNotebook() {

        List<Student> result = new ArrayList<>(studentList);
        Collections.sort(result);
        return result;

    }


}
