public record MenuItem(String name, String category, double price) {}

public class CafeMenuTest {
    public static void main(String[] args) {
        
        MenuItem item1 = new MenuItem("Schezwan Fried Rice", "Main Course", 12.99);
        MenuItem item2 = new MenuItem("Spring Rolls", "Appetizer", 6.50);
        MenuItem item3 = new MenuItem("Chocolate Lava Cake", "Dessert", 8.25);
    }
    
}
