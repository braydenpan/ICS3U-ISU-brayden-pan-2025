import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category;
        boolean validInput = false;
        System.out.println("Welcome to Walmarket.");
        System.out.println("Categories:");
        while(!validInput) {
            System.out.println("\t - Electronics");
            System.out.println("\t - Home ");
            System.out.println("\t - Books");
            System.out.println("\t - Music");
            System.out.println("\t - Sports");
            System.out.println("Enter a category to visit: ");
            category = sc.nextLine();
            switch(category.toLowerCase()) {
                case "electronics":
                    validInput = true;
                    System.out.println("Directing you to \" Electronics \" ");
                    break;
                case "home":
                    validInput = true;
                    System.out.println("Directing you to \" Home \" ");
                    break;
                case "books":
                    validInput = true;
                    System.out.println("Directing you to \" Books \" ");
                    break;
                case "music":
                    validInput = true;
                    System.out.println("Directing you to \" Music \" ");
                    break;
                case "sports":
                    validInput = true;
                    System.out.println("Directing you to \" Sports \" ");
                    break;
                default:
                    System.out.println("Invalid input");
                    System.out.println("Please select a valid category");
            }
        }
    }
}
