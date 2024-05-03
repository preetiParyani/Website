public class Solution {
  public static String doubleChar(String s) {

    String result = "";

    
      result += s.charAt(0) + s.charAt((s.length())-1);
    
    System.out.println(result);
    return result;
  }

  // Main method to test the function
  public static void main(String[] args) {
    doubleChar("Hello");
  }
}
