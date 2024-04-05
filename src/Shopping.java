import java.util.Scanner;

public class Shopping {
    static Scanner scanner = new Scanner(System.in);
    static int productCount = 0;

    public static void main(String[] args) {
        System.out.println("Вас приветствует список покупок!");
        int max_number_products = 8;
        String[] shoppingList = new String[max_number_products];

        String[] testShoppingList = {"хлеб", "сливочноемасло", "сыр", "докторскаяколбаса"};  //убрать
        productCount = 4; // убрать
        while (true) {
            testShoppingList = check_select_command(get_select_command(scanner), testShoppingList);

        }
    }

    public static int get_select_command(Scanner scanner) {
        System.out.println("Выберите одну из команд:");
        System.out.println("1. Добавить товар в список");
        System.out.println("2. Показать список");
        System.out.println("3. Очистить список");
        System.out.println("4. Завершить работу");

        return scanner.nextInt();

    }

    public static String[] check_select_command(int actionNumber, String[] shoppingList) {
        switch (actionNumber) {
            case 1:
                add_product_list(shoppingList);
                break;
            case 2:
                Show_list(shoppingList);
                break;
            case 3:
                clear_list();
                break;
            case 4:
                finish_work();
                break;
            default:
                System.out.println("Неизвестная команда!");
                break;
        }
        return shoppingList;
    }

    public static String[] add_product_list(String[] shoppingList) {
        String productName = scanner.next();
        shoppingList[productCount] = productName;
        productCount++;
        return shoppingList;
    }

    public static void Show_list(String[] shoppingList) {
        for (int i = 0; i < productCount; i++) {
            System.out.println("Продукт " + (i + 1) + ":" + shoppingList[i]);
        }
    }

    public static void clear_list() {
    }

    public static void finish_work() {
    }

}
