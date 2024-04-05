import java.util.Scanner;

public class Shopping {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        String[] shoppingList = new String[8];

        while (true) {
            select_command(scanner);
        }
    }
    public static void select_command(Scanner scanner) {
        System.out.println("Выберите одну из команд:");
        System.out.println("1. Добавить товар в список");
        System.out.println("2. Показать список");
        System.out.println("3. Очистить список");
        System.out.println("4. Завершить работу");

        int actionNumber = scanner.nextInt();
    }
}
