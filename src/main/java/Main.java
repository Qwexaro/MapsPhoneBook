import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        mapStudents.put("qwx.s.i@mail.ru",
                new Student("Sergey", 24, "qwx.s.i@mail.ru", 8987667876l)
        );

        mapStudents.put("qwx.s.i@mail.ru",
                new Student("Boris", 23, "qwx.s.i@mail.ru", 8987667876l)
        );

        mapStudents.put("qwx.s.i@mail.ru",
                new Student("Kuznechik", 21, "qwx.s.i@mail.ru", 8987667876l)
        );

        for (Map.Entry<String, Student> currentEmailStudent : mapStudents.entrySet()) {
            String currentEmail = currentEmailStudent.getKey(); // first parameters
            Student currentStudent = currentEmailStudent.getValue(); // second parameters
            System.out.println(currentEmail + " - " + currentStudent);
        }

    }
}
