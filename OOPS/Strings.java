
public class Strings {

    public static void main(String[] args) {

        String a = "India is the best";
        String b = "not";
        System.out.println("Length is: " + a.length());
        System.out.println("Lowercase is: " + a.toLowerCase());
        System.out.println("Uppercase is: " + a.toUpperCase());
        System.out.println("Index of: " + a.indexOf("i"));
        System.out.println("Last Index of: " + a.charAt(4));
        System.out.println("Substring: " + a.substring(3));
        System.out.println("Substring: " + a.substring(3, 7));
        System.out.println("Comapre: " + b.equals("Not"));
        System.out.println("Ignore Case: " + b.equalsIgnoreCase("Not"));
        System.out.println("Replace: " + a.replace("India", "Japan"));
    }

}
