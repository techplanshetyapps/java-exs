public record MenuItem(String name, String category, double price) {}

public class CafeMenuTest {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("Schezwan Fried Rice", "Main Course", 12.99);
        MenuItem item2 = new MenuItem("Spring Rolls", "Appetizer", 6.50);
        MenuItem item3 = new MenuItem("Chocolate Lava Cake", "Dessert", 8.25);
   
        System.out.println("--- Printing Record Instances ---");
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

        System.out.println("\n--- Printing Individual Components ---");
        
        System.out.println("Item 1 Name: " + item1.name());
        System.out.println("Item 1 Category: " + item1.category());
        System.out.println("Item 1 Price: $" + item1.price());
        
        System.out.println();
        
        System.out.println("Item 2 Name: " + item2.name());
        System.out.println("Item 2 Category: " + item2.category());
        System.out.println("Item 2 Price: $" + item2.price());
        
        System.out.println();
        
        System.out.println("Item 3 Name: " + item3.name());
        System.out.println("Item 3 Category: " + item3.category());
        System.out.println("Item 3 Price: $" + item3.price());
    }
    
}
