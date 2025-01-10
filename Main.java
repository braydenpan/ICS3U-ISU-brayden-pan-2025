import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        String category = "homepage";
        String selectionID;
        boolean validInput;
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
                validInput = false;
                while (!validInput) {
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
                            validInput = true;
                            break;
                        case "decor":
                            System.out.println("Directing you to \" Decor \" ");
                            validInput = true;
                            break;
                        case "books":
                            System.out.println("Directing you to \" Books \" ");
                            validInput = true;
                            break;
                        case "music":
                            System.out.println("Directing you to \" Music \" ");
                            validInput = true;
                            break;
                        case "sports":
                            System.out.println("Directing you to \" Sports \" ");
                            validInput = true;
                            break;
                        default:
                            System.out.println("Invalid input");
                            System.out.println("Please select a valid category");
                    }
                }
            }
            if (category.equalsIgnoreCase("electronics")) {
                System.out.println("Electronics");
                System.out.println("Items");
                System.out.println("\t Apple iPhone 16 Pro Max 512 GB \t $2049.99 \t 10 in Stock");
                System.out.println("\t\t selection id: iPhone");
                System.out.println();
                System.out.println("\t Acer Swift 5 \t $1499.99 \t 50 in Stock");
                System.out.println("\t\t selection id: Swift");
                System.out.println();
                System.out.println("\t Lenovo Legion Intel i7 GTX 1650 1TB Prebuilt PC \t $2499.99 \t 20 in Stock");
                System.out.println("\t\t selection id: Legion");
                System.out.println();
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
                //Code below displays the cart after the order
                System.out.println("Your cart contains: ");
                for(int i = 0;i < itemList.size();i++){
                    System.out.println();
                    System.out.println(itemList.get(i) + " (" + quantityList.get(i) + ")" + ", ");
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
                        System.out.println("Invalid input");
                        System.out.println("Redirecting you to Home Page");
                        category = "homepage";
                        break;

                }
            }else if(category.equalsIgnoreCase("decor")){
                System.out.println("Decor");
                System.out.println("Items");
                System.out.println("\t Black Oak Bedside Table \t $199.99 \t 20 in Stock");
                System.out.println("\t\t selection id: bedside");
                System.out.println();
                System.out.println("\t Oval Vertical Mirror - Silver \t $59.99 \t 50 in Stock");
                System.out.println("\t\t selection id: mirror");
                System.out.println();
                System.out.println("\t LED Table Lamp \t $29.99 \t 100 in Stock");
                System.out.println("\t\t selection id: lamp");
                System.out.println();
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
                System.out.println("Your cart contains: ");
                for(int i = 0;i < itemList.size();i++){
                    System.out.println();
                    System.out.println(itemList.get(i) + " (" + quantityList.get(i) + ")" + ", ");
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
                        System.out.println("Invalid input");
                        System.out.println("Redirecting you to Home Page");
                        category = "homepage";
                        break;

                }
            }else if(category.equalsIgnoreCase("books")){
                System.out.println("Books");
                System.out.println("Items");
                System.out.println("\t Java for Dummies \t $19.99 \t 150 in Stock");
                System.out.println("\t\t selection id: javadummies");
                System.out.println();
                System.out.println("\t The Hobbit \t $29.99 \t 100 in Stock");
                System.out.println("\t\t selection id: hobbit");
                System.out.println();
                System.out.println("\t 1984 \t $9.99 \t 100 in Stock");
                System.out.println("\t\t selection id: 1984");
                System.out.println();
                System.out.println("Enter selection id");
                selectionID = sc.nextLine();
                if (selectionID.equalsIgnoreCase("javadummies") || selectionID.equalsIgnoreCase("hobbit") || selectionID.equalsIgnoreCase("1984")) {
                    System.out.println("Enter desired quantity");
                    quantity = sc.nextInt();
                    if(selectionID.equalsIgnoreCase("javadummies") && quantity <= 150){
                        System.out.println("Added " + quantity + " Javadummies to cart.");
                        itemList.add("Java for Dummies");
                        quantityList.add(quantity);
                    }else if(selectionID.equalsIgnoreCase("hobbit") && quantity <= 100){
                        System.out.println("Added " + quantity + " Hobbit to cart.");
                        itemList.add("The Hobbit");
                        quantityList.add(quantity);
                    }else if(selectionID.equalsIgnoreCase("1984") && quantity <= 100){
                        System.out.println("Added " + quantity + " 1984 to cart.");
                        itemList.add("1984");
                        quantityList.add(quantity);
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
                System.out.println("Your cart contains: ");
                for(int i = 0;i < itemList.size();i++){
                    System.out.println();
                    System.out.println(itemList.get(i) + " (" + quantityList.get(i) + ")" + ", ");
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
                        System.out.println("Invalid input");
                        System.out.println("Redirecting you to Home Page");
                        category = "homepage";
                        break;

                }
            }else if(category.equalsIgnoreCase("music")){
                System.out.println("Music");
                System.out.println("Items");
                System.out.println("\t 4 Your Eyez Only - J.Cole \t $19.99 \t 200 in Stock");
                System.out.println("\t\t selection id: eyezonly");
                System.out.println();
                System.out.println("\t Bewitched - Laufey (Vinyl) \t 29.99 \t 100 in Stock");
                System.out.println("\t\t selection id: bewitched");
                System.out.println();
                System.out.println("\t Get Up - NewJeans \t 19.99 \t 100 in Stock");
                System.out.println("\t\t selection id: getup");
                System.out.println();
                System.out.println("Enter selection id");
                selectionID = sc.nextLine();
                if(selectionID.equalsIgnoreCase("eyezonly") || selectionID.equalsIgnoreCase("bewitched") || selectionID.equalsIgnoreCase("getup")){
                    System.out.println("Enter desired quantity");
                    quantity = sc.nextInt();
                    if(selectionID.equalsIgnoreCase("eyezonly") && quantity <= 200){
                        System.out.println("Added " + quantity + " 4 Your Eyez Only - J Cole to cart.");
                        itemList.add("4 Your Eyez Only - J Cole");
                        quantityList.add(quantity);
                    }else if(selectionID.equalsIgnoreCase("getup") && quantity <= 100){
                        System.out.println("Added " + quantity + " Get Up - NewJeans to cart.");
                        itemList.add("Get Up - NewJeans");
                        quantityList.add(quantity);
                    }else if(selectionID.equalsIgnoreCase("bewitched") && quantity <= 100){
                        System.out.println("Added " + quantity + " Bewitched - Laufey to cart.");
                        itemList.add("Bewitched - Laufey");
                        quantityList.add(quantity);
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
                System.out.println("Your cart contains: ");
                for(int i = 0;i < itemList.size();i++){
                    System.out.println();
                    System.out.println(itemList.get(i) + " (" + quantityList.get(i) + ")" + ", ");

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
                        System.out.println("Invalid input");
                        System.out.println("Redirecting you to Home Page");
                        category = "homepage";
                        break;

                }
            }
        }
    }
}
