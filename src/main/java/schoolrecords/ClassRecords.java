package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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


        return students.add(student);

    }


    // felvesz egy diákot az osztályba
//    public boolean removeStudent(Student student) {return null;}//kivesz egy diákot az osztályból
//    public double calculateClassAverage(){return null} //osztályátlagot számol, minden diákot figyelembe véve
//    public double calculateClassAverageBySubject(Subject subject){return null} //tantárgy szerinti osztályátlagot számol,
//    // kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye
//    public Student findStudentByName(String name){return null} // név szerint megkeres egy diákot az osztályban
//    public Student repetition() {return null}//felelethez a listából random módon kiválaszt egy diákot
//    public List<StudyResultByName> listStudyResults(){return null} //a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,

}


