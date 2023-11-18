public class Main {
    public static void main(String[] args) {

        ///     Задание 1      ///
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "";
        fullName = lastName + " " + firstName + " "+ middleName;
        System.out.println(fullName);

        ///     Задание 2      ///
String srt = new String(fullName);
        System.out.println(fullName.toUpperCase());


        ///     Задание 3     ///

        String fullName2 = "Иванов Семён Семёнович";
           fullName2 = fullName2.replace("ё", "е");
        System.out.println(fullName2);



    }
}