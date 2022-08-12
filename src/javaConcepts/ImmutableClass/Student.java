package ImmutableClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 *  How to create a immutable object ?
 *
 *  Remove all the setter from the class.
 *  Make instance variables private and final and create a constructor to initialize final variable
 *  Make class final to stop inheritance of this class
 *  Make deep copy of object if it is used in the current class
 *  Override hashcode() and equals() method in your class
 *
 */

class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}

final public class Student {
    private final String name ;
    private final int id ;
    private final ArrayList<String> studentNames;

    private final College college;
    //    Student(){}
    public Student(String name, int id, ArrayList<String> studentNames, College college) {
        this.name = name;
        this.id = id;

//        this.studentNames = studentNames;
        ArrayList <String> newList = new ArrayList<String>();

        for (String stu: studentNames) {
            newList.add(stu);
        }
        this.studentNames = newList;

        this.college = new College(college.collegeName);   // DEEP COPY
//        this.college = college;    SHALLOW COPY
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getStudentNames() {

        ArrayList <String> newList = new ArrayList<String>();

        for (String stu: studentNames) {
            newList.add(stu);
        }
        return newList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(studentNames, student.studentNames) && Objects.equals(college, student.college);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, studentNames, college);
    }

    public static void main(String[] args) {
        College college1 = new College("NIT KKR");
        System.out.println("College is :" + college1.hashCode());

        ArrayList<String> students = new ArrayList<>();
        students.add("Lawki");
        students.add("Loond");

        Student student = new Student("Happy Singh", 1, students, college1);

        System.out.println("Student List :" + student.getStudentNames() );
        student.getStudentNames().add("Aedi");
        System.out.println("Student List :" + student.getStudentNames() );

        System.out.println("COllege name is : " + student.college.getCollegeName());
        college1.setCollegeName("HULULULU college");
        System.out.println(student.college.hashCode());
        System.out.println("College name is : " + student.college.getCollegeName());
        HashMap<Student, Integer> map = new HashMap<>();
        map.put(student, 100);
        System.out.println(map.get(student));
    }
}
//class SuperStudent extends Student {
//
//    SuperStudent() {
//        super(name, id);
//    }
//
//    public int getId() {
//        return 8;
//    }
//
//    SuperStudent superStudent = new SuperStudent();
//    Student student = superStudent;
//}


class AbsoulteClass {
    AbsoulteClass() {}

    public static void main(String[] args) {
        System.out.println("This is the perfect destination");
    }
}