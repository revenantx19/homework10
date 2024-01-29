public class Main {
    public static void main(String[] args) {
        //task1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        //task2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта - " + fullName.toUpperCase());

        //task3
        fullName = "Иванов Иван Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName.replace("ё", "е"));


    }
}