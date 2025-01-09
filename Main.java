import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category = "";
        boolean validInput = false;
        int iPhoneStock = 10;
        int swiftStock = 50;
        int legionStock = 20;
        int quantity;
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
        if(category.equalsIgnoreCase("electronics")){
            System.out.println("Electronics");
            System.out.println("Items");
            System.out.println("\t Apple iPhone 16 Pro Max 512 GB \t $2049.99");
            System.out.println("\t\t selection id: iPhone");
            System.out.println("\t Acer Swift 5 \t $1499.99");
            System.out.println("\t\t selection id: Swift");
            System.out.println("\t Lenovo Legion Intel i7 GTX 1650 1TB Prebuilt PC \t $2499.99");
            System.out.println("\t\t selection id: Legion");
            System.out.println("Enter selection id or desired category");
            if(category.equalsIgnoreCase("iPhone") || category.equalsIgnoreCase("Swift") || category.equalsIgnoreCase("Legion")){
                System.out.println("Enter desired quantity");
                quantity = sc.nextInt();
                // Need to work on the below sections to actually add the quantities to cart, is only text rn not an actual action
                if(category.equalsIgnoreCase("iPhone") && quantity <= iPhoneStock && quantity > 0){
                    System.out.println("Added " + quantity + "to cart.");
                }else if (category.equalsIgnoreCase("Swift") && quantity <= swiftStock && quantity > 0){
                    System.out.println("Added " + quantity + "to cart.");
                }else if(category.equalsIgnoreCase("Legion") && quantity <= legionStock && quantity > 0){
                    System.out.println("Added " + quantity + "to cart.");
                }else{
                    System.out.println("Invalid Quantity");
                }
            }
        }
    }
}
