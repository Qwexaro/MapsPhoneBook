import java.util.*;

public class PhoneBook {
    private Map<String, String> nameToPhone;
    private Map<String, String> phoneToName;

    public PhoneBook() {
        nameToPhone = new HashMap<>();
        phoneToName = new HashMap<>();
    }

    public void addContactByName(String name, String phone) {
        if (isValidName(name) && isValidPhone(phone)) {
            nameToPhone.put(name, phone);
            phoneToName.put(phone, name);
            System.out.println("Контакт добавлен: " + name + " - " + phone);
        } else {
            System.out.println("Недопустимое имя или телефон.");
        }
    }

    public void addContactByPhone(String phone, String name) {
        if (isValidName(name) && isValidPhone(phone)) {
            phoneToName.put(phone, name);
            nameToPhone.put(name, phone);
            System.out.println("Контакт добавлен: " + name + " - " + phone);
        } else {
            System.out.println("Недопустимое имя или телефон.");
        }
    }

    public void findByName(String name) {
        if (nameToPhone.containsKey(name)) {
            System.out.println("Телефон для " + name + ": " + nameToPhone.get(name));
        } else {
            System.out.println("Абонент не найден.");
        }
    }

    public void findByPhone(String phone) {
        if (phoneToName.containsKey(phone)) {
            System.out.println("Имя для номера " + phone + ": " + phoneToName.get(phone));
        } else {
            System.out.println("Номер не найден.");
        }
    }

    public void listContacts() {
        TreeMap<String, String> sortedContacts = new TreeMap<>(nameToPhone);
        System.out.println("Список контактов:");
        for (Map.Entry<String, String> entry : sortedContacts.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Телефон: " + entry.getValue());
        }
    }

    private boolean isValidName(String name) {
        return name.matches("^[a-zA-Z ]+$");
    }

    private boolean isValidPhone(String phone) {
        return phone.matches("^\\+?[0-9]*$");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        String input;

        while (true) {
            System.out.println("Введите команду (ADD, FIND, LIST, EXIT): ");
            input = scanner.nextLine();

            if ("EXIT".equalsIgnoreCase(input)) break;

            String[] command = input.split(" ");
            switch (command[0].toUpperCase()) {
                case "ADD":
                    if (command.length == 3) {
                        phoneBook.addContactByName(command[1], command[2]);
                    } else if (command.length == 4 && command[1].matches("^[0-9]*$")) {
                        phoneBook.addContactByPhone(command[1], command[2]);
                    } else {
                        System.out.println("Неверный формат для ADD команды.");
                    }
                    break;
                case "FIND":
                    if (command[1].matches("^[0-9]*$")) {
                        phoneBook.findByPhone(command[1]);
                    } else {
                        phoneBook.findByName(command[1]);
                    }
                    break;
                case "LIST":
                    phoneBook.listContacts();
                    break;
                default:
                    System.out.println("Неизвестная команда.");
            }
        }
        scanner.close();
    }
}
