import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        String category = "homepage";
        String selectionID;
        boolean validInput = true;
        boolean cartOpen = false;
        int iPhoneStock = 10;
        int swiftStock = 50;
        int legionStock = 20;
        int bedsideStock = 20;
        int mirrorStock = 50;
        int lampStock = 100;
        int quantity;
        while(true){
            if(category.equalsIgnoreCase("homepage")) {
                System.out.println("Welcome to Walmarket.");
                System.out.println("Categories:");
                validInput = true;
                while (validInput) {
                    System.out.println("\t - Electronics");
                    System.out.println("\t - Decor ");
                    System.out.println("\t - Books");
                    System.out.println("\t - Music");
                    System.out.println("\t - Sports");
                    System.out.println("Enter a category to visit: ");
                    category = sc.nextLine();
                    switch (category.toLowerCase()) {
                        case "electronics":
                            System.out.println("Directing you to \" Electronics \" ");
                            break;
                        case "decor":
                            System.out.println("Directing you to \" Decor \" ");
                            break;
                        case "books":
                            System.out.println("Directing you to \" Books \" ");
                            break;
                        case "music":
                            System.out.println("Directing you to \" Music \" ");
                            break;
                        case "sports":
                            System.out.println("Directing you to \" Sports \" ");
                            break;
                        default:
                            validInput = false;
                            System.out.println("Invalid input");
                            System.out.println("Please select a valid category");
                    }
                    if(validInput){
                        break;
                    }
                }
            }
            if(validInput) {
                if (category.equalsIgnoreCase("electronics")) {
                    System.out.println("Electronics");
                    System.out.println("Items");
                    System.out.println("\t Apple iPhone 16 Pro Max 512 GB \t $2049.99 \t 10 in Stock");
                    System.out.println("\t\t selection id: iPhone");
                    System.out.println("\t Acer Swift 5 \t $1499.99 \t 50 in Stock");
                    System.out.println("\t\t selection id: Swift");
                    System.out.println("\t Lenovo Legion Intel i7 GTX 1650 1TB Prebuilt PC \t $2499.99 \t 20 in Stock");
                    System.out.println("\t\t selection id: Legion");
                    System.out.println("Enter selection id");
                    selectionID = sc.nextLine();
                    if (selectionID.equalsIgnoreCase("iPhone") || selectionID.equalsIgnoreCase("Swift") || selectionID.equalsIgnoreCase("Legion")) {
                        System.out.println("Enter desired quantity");
                        quantity = sc.nextInt();
                        if (selectionID.equalsIgnoreCase("iPhone") && quantity <= iPhoneStock && quantity > 0) {
                            System.out.println("Added " + quantity + " iPhone 16 Pro Max to cart.");
                            itemList.add("iPhone 16 Pro Max");
                            quantityList.add(quantity);
                        } else if (selectionID.equalsIgnoreCase("Swift") && quantity <= swiftStock && quantity > 0) {
                            System.out.println("Added " + quantity + " Acer Swift 5 to cart.");
                            itemList.add("Acer Swift 5");
                            quantityList.add(quantity);
                        } else if (selectionID.equalsIgnoreCase("Legion") && quantity <= legionStock && quantity > 0) {
                            System.out.println("Added " + quantity + " Lenovo Legion PC to cart.");
                            itemList.add("Lenovo Legion PC");
                            quantityList.add(quantity);
                        } else {
                            System.out.println("Invalid Quantity");
                        }
                    }else{
                        System.out.println("Invalid selection");
                    }
                    System.out.println("Where would you like to go now?");
                    System.out.println("\t - Homepage \n \t - Electronics \n \t - Decor \n \t - Books \n \t - Music \n \t - Sports");
                    sc.nextLine();
                    category = sc.nextLine();
                    switch (category.toLowerCase()) {
                        case "homepage":
                        case "electronics":
                        case "decor":
                        case "books":
                        case "music":
                        case "sports":
                            System.out.println("Redirecting you to " + category);
                            break;
                        default:
                            validInput = false;
                            System.out.println("Invalid input");
                            System.out.println("Redirecting you to Home Page");
                            category = "homepage";
                            break;

                    }
                }
                if(category.equalsIgnoreCase("decor")){
                    System.out.println("Decor");
                    System.out.println("Items");
                    System.out.println("\t Black Oak Bedside Table \t $199.99 \t 20 in Stock");
                    System.out.println("\t\t selection id: bedside");
                    System.out.println("\t Oval Vertical Mirror - Silver \t $59.99 \t 50 in Stock");
                    System.out.println("\t\t selection id: mirror");
                    System.out.println("\t LED Table Lamp \t $29.99 \t 100 in Stock");
                    System.out.println("\t\t selection id: lamp");
                    System.out.println("Enter selection id");
                    selectionID = sc.nextLine();
                    if (selectionID.equalsIgnoreCase("bedside") || selectionID.equalsIgnoreCase("mirror") || selectionID.equalsIgnoreCase("lamp")) {
                        System.out.println("Enter desired quantity");
                        quantity = sc.nextInt();
                        if(selectionID.equalsIgnoreCase("bedside") && quantity <= bedsideStock){
                            System.out.println("Added " + quantity + " Bedside Table to cart.");
                            itemList.add("Bedside Table");
                            quantityList.add(quantity);
                        }else if(selectionID.equalsIgnoreCase("mirror") && quantity <= mirrorStock){
                            System.out.println("Added " + quantity + " Mirror to cart.");
                            itemList.add("Oval Mirror");
                            quantityList.add(quantity);
                        }else if(selectionID.equalsIgnoreCase("lamp") && quantity <= lampStock){
                            System.out.println("Added " + quantity + " Lamp to cart.");
                            itemList.add("LED Table Lamp");
                            quantityList.add(quantity);
                        }else{
                            System.out.println("Invalid Quantity");
                        }
                    }else{
                        System.out.println("Invalid selection");
                    }
                    System.out.println("Where would you like to go now?");
                    System.out.println("\t - Homepage \n \t - Electronics \n \t - Decor \n \t - Books \n \t - Music \n \t - Sports");
                    sc.nextLine();
                    category = sc.nextLine();
                    switch (category.toLowerCase()) {
                        case "homepage":
                        case "electronics":
                        case "decor":
                        case "books":
                        case "music":
                        case "sports":
                            System.out.println("Redirecting you to " + category);
                            break;
                        default:
                            validInput = false;
                            System.out.println("Invalid input");
                            System.out.println("Redirecting you to Home Page");
                            category = "homepage";
                            break;

                    }
                }
            }
        }
    }
}
