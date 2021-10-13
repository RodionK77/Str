import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s1 = scanner.next().toCharArray();
        char[] s2 = scanner.next().toCharArray();
        MyString str1 = new MyString(s1);
        MyString str2 = new MyString(s2);
        if (str1.isEmpty())
            System.out.println("Строка 1 пустая");
        else
            System.out.println("Строка 1 не пустая");

        System.out.println("Третий символ строки 1: " + str1.charAt(2));
        str1 = str1.concat(str1, str2);
        System.out.println("Объединённые строки 1 и 2: " + str1.toString());

        MyString strtwo1 = new MyString("Blank");
        MyString strtwo2 = new MyString("Blonk");
        System.out.println("Новая строка 1: " + strtwo1 + ", новая строка 2: " + strtwo2);
        System.out.println("Сравнение строки 1 со строкой 2 : " + strtwo1.compareTo(strtwo2));
        System.out.println("Сравнение строки 2 со строкой 1 : " + strtwo2.compareTo(strtwo1));
        System.out.println("Сравнение строки 2 со строкой 2 : " + strtwo2.compareTo(strtwo2));

        MyString trimTest = new MyString("  onetwo   ");
        System.out.println(trimTest.trim());

        MyString Str = new MyString("Сколько будет два плюс два?");
        System.out.print("Очередная тестовая строка: " + Str);
        System.out.print("\nВторое слово из этой строки: " + Str.substring(8, 13));
    }
}
