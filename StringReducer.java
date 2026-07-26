import java.util.Arrays;

public class StringReducer {
    public static void main(String[] args) {
        String[] grades = {"A", "B", "C"};
   
        StringBuilder concat = Arrays.stream(grades)
                .map(StringBuilder::new)
                .reduce(new StringBuilder(), (sb1, sb2) -> sb1.append(sb2));
    }
    
}
