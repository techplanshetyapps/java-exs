public class IRUtil {
    public static int getFrequencyCount(String query, String doc) {
   
            query = query.toLowerCase();
            doc = doc.toLowerCase();
            
            int frequencyCount = 0;
            int index = doc.indexOf(query);

            while (index >= 0) {
                frequencyCount++;
                doc = doc.substring(index + query.length());
                index = doc.indexOf(query);
            }
            
            return frequencyCount;
        }
    public static double queryFrequency(String query, String doc) {

            int frequencyCount = getFrequencyCount(query, doc);
            
            String[] words = doc.split(" ");
            int totalQueryCount = words.length;
            
            if (totalQueryCount == 0) {
                return 0.0;
            }
            return (double) frequencyCount / totalQueryCount;
        }
}
