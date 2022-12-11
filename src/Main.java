public class Main {

    public static void task1(){
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника — "+fullName);
        task2(fullName);
        task3(fullName);
    }

    public static void task2(String fullName){
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }

    public static void task3(String fullName){
        String changedName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + changedName);
    }

    public static void main(String[] args) {
        task1();
    }
}