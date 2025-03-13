import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> mapStudents = new HashMap<>();
        mapStudents.put("qwx.s.i@mail.ru",
                new Student("Sergey", 24, "qwx.s.i@mail.ru", 8987667876l)
        );

        mapStudents.put("qwx.s.i@mail.ru",
                new Student("Boris", 23, "qwx.s.i@mail.ru", 8987667876l)
        );

        mapStudents.put("qwx.s.i@mail.ru",
                new Student("Kuznechik", 21, "qwx.s.i@mail.ru", 8987667876l)
        );

    }
}
