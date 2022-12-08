import java.util.Scanner;

public class PrintYourNameAndSurname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.printf("%s, what's your last name?", name);
        String surname = scanner.nextLine();
        System.out.println(name + "\n" + surname);
    }


}
