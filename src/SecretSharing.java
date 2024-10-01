//
//import org.json.JSONObject;
//import java.io.FileReader;
//import java.math.BigInteger;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class SecretSharing {
//    public static void main(String[] args) {
//        try {
//            // Read the JSON file
//            FileReader reader = new FileReader("input.json");
//            StringBuilder sb = new StringBuilder();
//            int i;
//            while ((i = reader.read()) != -1) {
//                sb.append((char) i);
//            }
//            reader.close();
//
//            // Parse the JSON object
//            JSONObject jsonObject = new JSONObject(sb.toString());
//
//            // Get the values of 'n' and 'k'
//            JSONObject keys = jsonObject.getJSONObject("keys");
//            int n = keys.getInt("n");
//            int k = keys.getInt("k");
//
//            // Create a map to store x, y pairs
//            TreeMap<Integer, BigInteger> points = new TreeMap<>();
//
//            // Iterate through the JSON keys and decode the points
//            for (String key : jsonObject.keySet()) {
//                if (!key.equals("keys")) {
//                    int x = Integer.parseInt(key);
//                    JSONObject valueObj = jsonObject.getJSONObject(key);
//                    int base = valueObj.getInt("base");
//                    String value = valueObj.getString("value");
//
//                    // Convert the value from the given base to base 10
//                    BigInteger y = new BigInteger(value, base);
//                    points.put(x, y);
//                }
//            }
//
//            // Calculate the constant term using Lagrange interpolation
//            BigInteger constantTerm = lagrangeInterpolation(points, k);
//            System.out.println("The constant term c is: " + constantTerm);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Method to perform Lagrange interpolation
//    public static BigInteger lagrangeInterpolation(TreeMap<Integer, BigInteger> points, int k) {
//        BigInteger result = BigInteger.ZERO;
//
//        // Lagrange interpolation
//        for (Map.Entry<Integer, BigInteger> entry1 : points.entrySet()) {
//            int x_i = entry1.getKey();
//            BigInteger y_i = entry1.getValue();
//
//            // Calculate the Lagrange basis polynomial for x_i
//            BigInteger term = y_i;
//            for (Map.Entry<Integer, BigInteger> entry2 : points.entrySet()) {
//                int x_j = entry2.getKey();
//                if (x_i != x_j) {
//                    term = term.multiply(BigInteger.valueOf(-x_j))
//                            .divide(BigInteger.valueOf(x_i - x_j));
//                }
//            }
//            result = result.add(term);
//        }
//
//        return result;
//    }
//}
//
