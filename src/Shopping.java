import java.util.Scanner;

public class Shopping {
    static Scanner scanner = new Scanner(System.in);
    static int productCount = 0;
    static boolean isWorks = true;

    public static void main(String[] args) {
        System.out.println("Вас приветствует список покупок!");
        int max_number_products = 8;
        String[] shoppingList = new String[max_number_products];


        while (isWorks) {
            check_select_command(get_select_command(scanner), shoppingList, max_number_products);
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

    public static void check_select_command(int actionNumber, String[] shoppingList, int max_number_products) {
        switch (actionNumber) {
            case 1:
                add_product_list(shoppingList, max_number_products);
                break;
            case 2:
                show_list(shoppingList);
                break;
            case 3:
                clear_list(shoppingList);
                break;
            case 4:
                finish_work();
                break;
            default:
                System.out.println("Неизвестная команда!");
                break;
        }
    }

    public static void add_product_list(String[] shoppingList, int max_number_products) {
        System.out.println("Какой товар добавить?");
        String productName = scanner.next();
        if (check_adding_products(shoppingList, productName, max_number_products)) {
            shoppingList[productCount] = productName;
            productCount++;
            System.out.println(productName + " добавлен в список");
        }
    }


    public static boolean check_adding_products(String[] shoppingList, String productName, int max_number_products) {
        if (productCount == max_number_products) {
            System.out.println("Товар " + productName + " Нельзя добавить, вы заполнили корзину!");
            return false;
        } else {
            for (int i = 0; i < productCount; i++) {
                if (shoppingList[i].equals(productName)) {
                    System.out.println("Товар " + productName + " уже есть в списке.");
                    return false;
                }

            }
            return true;
        }
    }

    public static void show_list(String[] shoppingList) {
        if (productCount == 0) {
            System.out.println("Корзина пуста!");
        }
        for (int i = 0; i < productCount; i++) {
            System.out.println("Продукт " + (i + 1) + ":" + shoppingList[i]);
        }
    }

    public static void clear_list(String[] shoppingList) {
        for (int i = 0; i < productCount; i++) {
            shoppingList[i] = null;
        }
        productCount = 0;
        System.out.println("Список покупок очищен.");

    }

    public static void finish_work() {
        isWorks = false;
        System.out.println("Работа завершена.");
    }

}