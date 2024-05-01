public class Solution {
  public static String doubleChar(String s) {

    String result = "";

    for (int i = 0; i < s.length(); i++) {
      result += Character.toString(s.charAt(i)) + Character.toString(s.charAt(i));
    }
    System.out.println(result);
    return result;
  }

  // Main method to test the function
  public static void main(String[] args) {
    doubleChar("Hello");
  }
}
