import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        String category = "homepage";
        String selectionID;
        String input;
        int subtotal = 0;
        double subtotal2;
        boolean validInput;
        boolean completedOrder = false;
        int quantity;
        int quantity2;
        int iPhoneStock = 10;
        int swiftStock = 50;
        int legionStock = 20;
        int bedsideStock = 20;
        int mirrorStock = 50;
        int lampStock = 100;
        int javaDummiesStock = 150;
        int hobbitStock = 100;
        int nineteenStock = 100;
        int eyezOnlyStock = 200;
        int bewitchedStock = 100;
        int getUpStock = 100;
        int astroxStock = 50;
        int spaldingStock = 100;
        int mikasaStock = 100;
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
                    System.out.println("\t - My Cart");
                    System.out.println("\t - Admin Login");
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
                System.out.println("\t Apple iPhone 16 Pro Max 512 GB \t $2049.99");
                if(iPhoneStock > 0){
                    System.out.print( "\t " + iPhoneStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: iPhone");
                System.out.println();
                System.out.println("\t Acer Swift 5 \t $1499.99");
                if(swiftStock > 0){
                    System.out.print( "\t " + swiftStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: Swift");
                System.out.println();
                System.out.println("\t Lenovo Legion Intel i7 GTX 1650 1TB Prebuilt PC \t $2499.99");
                if(legionStock > 0){
                    System.out.print( "\t " + legionStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: Legion");
                System.out.println();
                System.out.println("Enter selection id");
                selectionID = sc.nextLine();
                if (selectionID.equalsIgnoreCase("iPhone") || selectionID.equalsIgnoreCase("Swift") || selectionID.equalsIgnoreCase("Legion")) {
                    System.out.println("Enter desired quantity");
                    quantity = sc.nextInt();
                    if (selectionID.equalsIgnoreCase("iPhone") && quantity <= iPhoneStock && quantity > 0) {
                        System.out.println("Added " + quantity + " iPhone 16 Pro Max to cart.");
                        itemList.add("iPhone16");
                        quantityList.add(quantity);
                        subtotal += 204999 * quantity;
                        iPhoneStock -= quantity;
                    } else if (selectionID.equalsIgnoreCase("Swift") && quantity <= swiftStock && quantity > 0) {
                        System.out.println("Added " + quantity + " Acer Swift 5 to cart.");
                        itemList.add("AcerSwift5");
                        quantityList.add(quantity);
                        subtotal += 149999 * quantity;
                        swiftStock -= quantity;
                    } else if (selectionID.equalsIgnoreCase("Legion") && quantity <= 20 && quantity > 0) {
                        System.out.println("Added " + quantity + " Lenovo Legion PC to cart.");
                        itemList.add("LenovoLegionPC");
                        quantityList.add(quantity);
                        subtotal += 249999 * quantity;
                        legionStock -= quantity;
                    } else {
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("decor")){
                System.out.println("Decor");
                System.out.println("Items");
                System.out.println("\t Black Oak Bedside Table \t $199.99");
                if(bedsideStock > 0){
                    System.out.print( "\t " + bedsideStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: bedside");
                System.out.println();
                System.out.println("\t Oval Vertical Mirror - Silver \t $59.99");
                if(mirrorStock > 0){
                    System.out.print( "\t " + mirrorStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: mirror");
                System.out.println();
                System.out.println("\t LED Table Lamp \t $29.99");
                if(lampStock > 0){
                    System.out.print( "\t " + lampStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: lamp");
                System.out.println();
                System.out.println("Enter selection id");
                selectionID = sc.nextLine();
                if (selectionID.equalsIgnoreCase("bedside") || selectionID.equalsIgnoreCase("mirror") || selectionID.equalsIgnoreCase("lamp")) {
                    System.out.println("Enter desired quantity");
                    quantity = sc.nextInt();
                    if(selectionID.equalsIgnoreCase("bedside") && quantity <= bedsideStock && quantity > 0){
                        System.out.println("Added " + quantity + " Bedside Table to cart.");
                        itemList.add("BedsideTable");
                        quantityList.add(quantity);
                        subtotal += 19999 * quantity;
                        bedsideStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("mirror") && quantity <= mirrorStock && quantity > 0){
                        System.out.println("Added " + quantity + " Mirror to cart.");
                        itemList.add("OvalMirror");
                        quantityList.add(quantity);
                        subtotal += 5999 * quantity;
                        mirrorStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("lamp") && quantity <= lampStock && quantity > 0){
                        System.out.println("Added " + quantity + " Lamp to cart.");
                        itemList.add("TableLamp");
                        quantityList.add(quantity);
                        subtotal += 2999 * quantity;
                        lampStock -= quantity;
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("books")){
                System.out.println("Books");
                System.out.println("Items");
                System.out.println("\t Java for Dummies \t $19.99");
                if(javaDummiesStock > 0){
                    System.out.print( "\t " + javaDummiesStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: javadummies");
                System.out.println();
                System.out.println("\t The Hobbit \t $29.99");
                if(hobbitStock > 0){
                    System.out.print( "\t " + hobbitStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: hobbit");
                System.out.println();
                System.out.println("\t 1984 \t $9.99");
                if(nineteenStock > 0){
                    System.out.print( "\t " + nineteenStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: 1984");
                System.out.println();
                System.out.println("Enter selection id");
                selectionID = sc.nextLine();
                if (selectionID.equalsIgnoreCase("javadummies") || selectionID.equalsIgnoreCase("hobbit") || selectionID.equalsIgnoreCase("1984")) {
                    System.out.println("Enter desired quantity");
                    quantity = sc.nextInt();
                    if(selectionID.equalsIgnoreCase("javadummies") && quantity <= javaDummiesStock && quantity > 0){
                        System.out.println("Added " + quantity + " Javadummies to cart.");
                        itemList.add("JavaforDummies");
                        quantityList.add(quantity);
                        subtotal += 1999 * quantity;
                        javaDummiesStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("hobbit") && quantity <= hobbitStock && quantity > 0){
                        System.out.println("Added " + quantity + " Hobbit to cart.");
                        itemList.add("TheHobbit");
                        quantityList.add(quantity);
                        subtotal += 2999 * quantity;
                        hobbitStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("1984") && quantity <= nineteenStock && quantity > 0){
                        System.out.println("Added " + quantity + " 1984 to cart.");
                        itemList.add("1984");
                        quantityList.add(quantity);
                        subtotal += 999 *  quantity;
                        nineteenStock -= quantity;
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("music")){
                System.out.println("Music");
                System.out.println("Items");
                System.out.println("\t 4 Your Eyez Only - J.Cole \t $19.99");
                if(eyezOnlyStock > 0){
                    System.out.print( "\t " + eyezOnlyStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: eyezonly");
                System.out.println();
                System.out.println("\t Bewitched - Laufey (Vinyl) \t 29.99");
                if(bewitchedStock > 0){
                    System.out.print( "\t " + bewitchedStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: bewitched");
                System.out.println();
                System.out.println("\t Get Up - NewJeans \t 19.99");
                if(getUpStock > 0){
                    System.out.print( "\t " + getUpStock+  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: getup");
                System.out.println();
                System.out.println("Enter selection id");
                selectionID = sc.nextLine();
                if(selectionID.equalsIgnoreCase("eyezonly") || selectionID.equalsIgnoreCase("bewitched") || selectionID.equalsIgnoreCase("getup")){
                    System.out.println("Enter desired quantity");
                    quantity = sc.nextInt();
                    if(selectionID.equalsIgnoreCase("eyezonly") && quantity <= eyezOnlyStock && quantity > 0){
                        System.out.println("Added " + quantity + " 4 Your Eyez Only - J Cole to cart.");
                        itemList.add("4YourEyezOnly");
                        quantityList.add(quantity);
                        subtotal += 1999 * quantity;
                        eyezOnlyStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("getup") && quantity <= getUpStock && quantity > 0){
                        System.out.println("Added " + quantity + " Get Up - NewJeans to cart.");
                        itemList.add("GetUp");
                        quantityList.add(quantity);
                        subtotal += 1999 * quantity;
                        getUpStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("bewitched") && quantity <= bewitchedStock && quantity > 0){
                        System.out.println("Added " + quantity + " Bewitched - Laufey to cart.");
                        itemList.add("Bewitched");
                        quantityList.add(quantity);
                        subtotal += 2999 * quantity;
                        bewitchedStock -= quantity;
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("sports")){
                System.out.println("Sports");
                System.out.println("Items");
                System.out.println();
                System.out.println("\t Yonex Astrox 100 Game Badminton Racquet \t $149.99");
                if(astroxStock > 0){
                    System.out.print( "\t " + astroxStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: 100game");
                System.out.println();
                System.out.println("\t Spalding NBA Indoor Basketball \t $59.99");
                if(spaldingStock > 0){
                    System.out.print( "\t " + spaldingStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: spaldingball");
                System.out.println();
                System.out.println("\t Mikasa v360w Indoor Volleyball \t $34.99 \t 100 in Stock");
                if(mikasaStock > 0){
                    System.out.print( "\t " + mikasaStock +  "in Stock");
                }else{
                    System.out.print(" \t (Out of Stock)");
                }
                System.out.println("\t\t selection id: mikasa");
                System.out.println();
                System.out.println("Enter selection id");
                selectionID = sc.nextLine();
                if(selectionID.equalsIgnoreCase("100game")|| selectionID.equalsIgnoreCase("spaldingball") || selectionID.equalsIgnoreCase("mikasa")){
                    System.out.println("Enter desired quantity");
                    quantity = sc.nextInt();
                    if(selectionID.equalsIgnoreCase("100game") && quantity <= astroxStock && quantity > 0){
                        System.out.println("Added " + quantity + " Astrox 100 Game to cart.");
                        itemList.add("Astrox100Game");
                        quantityList.add(quantity);
                        subtotal += 14999 * quantity;
                        astroxStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("spaldingball") && quantity <= spaldingStock && quantity > 0){
                        System.out.println("Added " + quantity + " Spalding Indoor Basketball to cart.");
                        itemList.add("SpaldingBasketball");
                        quantityList.add(quantity);
                        subtotal += 5999 * quantity;
                        spaldingStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("mikasa") && quantity <= mikasaStock && quantity > 0){
                        System.out.println("Added " + quantity + " Mikasa v360w Volleyball to cart.");
                        itemList.add("MikasaVolleyball");
                        quantityList.add(quantity);
                        subtotal += 3499 * quantity;
                        mikasaStock -= quantity;
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("my cart")){
                System.out.println("Your Cart");
                System.out.println("Items");
                for(int i = 0; i < itemList.size(); i++){
                    System.out.println(itemList.get(i) + " (" + quantityList.get(i) + "), ");
                }
                System.out.println();
                System.out.println("Would you like to edit any of the quantities of your items (Y/N)");
                input = sc.nextLine();
                if(input.equalsIgnoreCase("Y")){
                    System.out.println("Which item's quantity would you like to change? (Enter the item as it appears in your cart)");
                    input = sc.nextLine();
                    quantity = quantityList.get(itemList.indexOf(input));
                    if(quantity > 0){
                        System.out.println("How many would you like to add?(use a negative integer for removal)");
                        quantity2 = sc.nextInt();
                        switch(input.toLowerCase()){
                            case "iphone16":
                                if(quantity2+quantity < iPhoneStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "acerswift5":
                                if(quantity2+quantity < swiftStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "lenovolegionpc":
                                if(quantity2+quantity < legionStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "bedsidetable":
                                if(quantity2+quantity < bedsideStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "ovalmirror":
                                if(quantity2+quantity < mirrorStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "tablelamp":
                                if(quantity2+quantity < lampStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "javafordummies":
                                if(quantity2+quantity < javaDummiesStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "thehobbit":
                                if(quantity2+quantity < hobbitStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "1984":
                                if(quantity2+quantity < nineteenStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "4youreyezonly":
                                if(quantity2+quantity < eyezOnlyStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "getup":
                                if(quantity2+quantity < getUpStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "bewitched":
                                if(quantity2+quantity < bewitchedStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "astrox100game":
                                if(quantity2+quantity < astroxStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "spaldingbasketball":
                                if(quantity2+quantity < spaldingStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "mikasavolleyball":
                                if(quantity2+quantity < mikasaStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                    }else{
                        System.out.println("Invalid Input");
                    }
                } else if (input.equalsIgnoreCase("N")) {
                    subtotal2 = subtotal / 100.0;
                    System.out.println("Your order: ");
                    for(int i = 0; i < itemList.size(); i++){
                        input = itemList.get(i);
                        quantity = quantityList.get(i);
                        switch (input.toLowerCase()) {
                            case "iphone16":
                                System.out.println("iPhone 16 Pro Max 512 GB: " + quantity + " $" + quantity*2049.99);
                                break;
                            case "acerswift5":
                                System.out.println("Acer Swift 5: " + quantity + " $" + quantity*1499.99);
                                break;
                            case "lenovolegionpc":
                                System.out.println("Lenovo Legion PC: " + quantity + " $" + quantity*2499.99);
                                break;
                            case "bedsidetable":
                                System.out.println("Bedside Table: " + quantity + " $" + 199.99*quantity);
                                break;
                            case "ovalmirror":
                                System.out.println("Oval Mirror (Silver): " + quantity + " $" + 59.99*quantity);
                                break;
                            case "tablelamp":
                                System.out.println("LED Table Lamp: " + quantity + " $" + 29.99*quantity);
                                break;
                            case "javafordummies":
                                System.out.println("Java For Dummies: " + quantity + " $" + 19.99*quantity);
                                break;
                            case "thehobbit":
                                System.out.println("The Hobbit: " + quantity + " $" + 29.99*quantity);
                                break;
                            case "1984":
                                System.out.println("1984: " + quantity + " $" + 9.99*quantity);
                                break;
                            case "4youreyezonly":
                                System.out.println("4 Your Eyez Only - J.Cole: " + quantity + " $" + 19.99*quantity);
                                break;
                            case "getup":
                                System.out.println("Get Up - NewJeans: " + quantity + " $" + 19.99*quantity);
                                break;
                            case "bewitched":
                                System.out.println("Bewitched (Vinyl) - Laufey: " + quantity + " $" + 29.99*quantity);
                                break;
                            case "astrox100game":
                                System.out.println("Astrox 100 Game: " + quantity + " $" + 149.99*quantity);
                                break;
                            case "spaldingbasketball":
                                System.out.println("Spalding Indoor Basketball: " + quantity + " $" + 59.99*quantity);
                                break;
                            case "mikasavolleyball":
                                System.out.println("Mikasa v360w Volleyball: " + quantity + " $" + 34.99*quantity);
                                break;
                        }
                    }
                    System.out.println("Your subtotal is: $" + subtotal2);
                    System.out.println("Your total is: $" +  Math.round(subtotal2 * 1.13*100.0)/100.0);
                    System.out.println("Would you like to confirm your order?(Y/N)");
                    input = sc.nextLine();
                    if(input.equalsIgnoreCase("y")){
                        System.out.println("Your order is confirmed");
                        completedOrder = true;
                    }
                }

            }
            if(category.equalsIgnoreCase("electronics") || category.equalsIgnoreCase("decor") || category.equalsIgnoreCase("books") || category.equalsIgnoreCase("music") || category.equalsIgnoreCase("sports")) {

                System.out.println("Your cart contains: ");
                System.out.println();
                for (int i = 0; i < itemList.size(); i++) {
                    System.out.println(itemList.get(i) + " (" + quantityList.get(i) + ")" + ", ");
                }
                System.out.println("Where would you like to go now?");
                System.out.println("\t - Homepage \n \t - Electronics \n \t - Decor \n \t - Books \n \t - Music \n \t - Sports \n \t - My Cart \n \t - Admin Login");
                sc.nextLine();
                category = sc.nextLine();
                switch (category.toLowerCase()) {
                    case "homepage":
                    case "electronics":
                    case "decor":
                    case "books":
                    case "music":
                    case "sports":
                    case "my cart":
                    case "admin login":
                    case "mycart":
                    case "adminlogin":
                        System.out.println("Redirecting you to " + category);
                        break;
                    default:
                        System.out.println("Invalid input");
                        System.out.println("Redirecting you to Home Page");
                        category = "homepage";
                        break;

                }
            }
            if(completedOrder){
                break;
            }
        }
        System.out.println("Thank you for shopping at Walmarket.");
    }
}
