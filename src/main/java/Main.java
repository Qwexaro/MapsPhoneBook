import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        new Student("Sergey", 24, "qwx.s.i@mail.ru", 8987667876l);


        new Student("Boris", 23, "qwx.s.i@mail.ru", 8987667876l);


        new Student("Kuznechik", 21, "qwx.s.i@mail.ru", 8987667876l);

        Student.removeSelectedStudent(8987667876l);
        Student.getListAllStudents();

    }
}
