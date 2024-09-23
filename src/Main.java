public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Задача 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);
        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName
                .replace("ё", "е")
                .replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}