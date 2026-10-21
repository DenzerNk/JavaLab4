import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість предметів одягу: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        Clothes[] wardrobe = new Clothes[count];
        for (int i = 0; i < count; i++) {
            System.out.println("\nОдяг " + (i + 1));
            System.out.print("Назва: ");
            String name = scanner.nextLine();
            System.out.print("Розмір: ");
            String size = scanner.nextLine();
            System.out.print("Ціна: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            wardrobe[i] = new Clothes(name, size, price);
        }
        System.out.println("\n--- Гардероб ---");
        for (Clothes item : wardrobe) {
            System.out.println(item.toString());
        }
        scanner.close();
    }
}