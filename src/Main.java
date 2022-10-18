public class Main {
    public static void main(String[] args) {


        System.out.println("Задание №1");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задание №2");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника — " + fullNameUpper);

        System.out.println("Задание №3");
        fullName = "Иванов Семён Семёнович";
        String replaceFullName = fullName.replace('ё', 'е');
        System.out.println(replaceFullName);

    }
}