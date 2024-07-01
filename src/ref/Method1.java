package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);   // x001
//        student1.name = "학생1";
//        student1.age = 15;
//        student1.grade = 90;

//        Student student2 = new Student();   // x002
        Student student2 = createStudent("학생2", 16, 80);
//        student2.name = "학생2";
//        student2.age = 16;
//        student2.grade = 80;

//        initStudent(student1, "학생1", 15, 90);
//        initStudent(student2, "학생2", 16, 80);
        printStudent(student1);
        printStudent(student2);
    }

    public static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    public static void printStudent(Student student){
        System.out.printf("이름:%s 나이:%d 성적:%d\n", student.name, student.age, student.grade);
    }

    public static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

}
