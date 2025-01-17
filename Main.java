//NAME: Brayden Pan
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaring and initializing my arraylists, one for the items in the cart, one for the quantities in the cart, one for orders, and one for the status of the orders. The variable is so that I can compile carts into a single string.
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        ArrayList<String> orderList = new ArrayList<>();
        ArrayList<String> shippedList = new ArrayList<>();
        String order = "";
        //declaring variables, such as inputs, totals, booleans, the password, and stocks.
        String category = "homepage";
        String selectionID;
        String input;
        String password = "a100wouldbereallycool";
        double subtotal2 = 0.0;
        boolean validInput;
        boolean completedOrder = false;
        boolean reiteration = false;
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
        //I want my user to be able to be able to keep coming back to whatever they want until they finish their order.
        while(true){
            if(category.equalsIgnoreCase("homepage")) {
                //This is the homepage, where you can't buy anything yet, and is the nexus point for everything. The validInput variable is there so that the homepage reiterates if the user doesn't input a valid category.
                System.out.println("Welcome to Walmarket.");
                System.out.println("Categories:");
                validInput = false;
                reiteration = false;
                while (!validInput) {
                    System.out.println("\t - Electronics");
                    System.out.println("\t - Decor ");
                    System.out.println("\t - Books");
                    System.out.println("\t - Music");
                    System.out.println("\t - Sports");
                    System.out.println("\t - My Cart");
                    System.out.println("\t - Admin Login");
                    System.out.println("\t - Exit");
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
                        case "my cart":
                        case "mycart":
                            System.out.println("Directing you to \" My Cart \" ");
                            validInput = true;
                            break;
                        case "admin login":
                        case "adminlogin":
                            System.out.println("Directing you to \" Admin Login \" ");
                            validInput = true;
                            break;
                        case "exit":
                            validInput = true;
                            break;
                        default:
                            System.out.println("Invalid input");
                            System.out.println("Please select a valid category");
                    }
                }
            }
            if (category.equalsIgnoreCase("electronics")) {
                //This is the electronics section, and I have my if statements such that if the remaining stock of an item is 0, it will show that it is out of stock.
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
                //I chose to use selection ids to make the user's life easier, by having them enter simpler strings.
                System.out.println("Enter selection id");
                selectionID = sc.nextLine();
                if (selectionID.equalsIgnoreCase("iPhone") || selectionID.equalsIgnoreCase("Swift") || selectionID.equalsIgnoreCase("Legion")) {
                    System.out.println("Enter desired quantity");
                    quantity = sc.nextInt();
                    if (selectionID.equalsIgnoreCase("iPhone") && quantity <= iPhoneStock && quantity > 0) {
                        System.out.println("Added " + quantity + " iPhone 16 Pro Max to cart.");
                        //The below code block is present in all the other blocks that add items to cart. It checks whether the item already exists in their cart, and if it does, doesn't add it as an extra item, but changes the quantity.
                        if(itemList.contains("iPhone16")){
                            quantity2 = quantityList.get(itemList.indexOf("iPhone16"));
                            quantityList.set(itemList.indexOf("iPhone16"),quantity + quantity2);
                        }else {
                            itemList.add("iPhone16");
                            quantityList.add(quantity);
                        }
                        iPhoneStock -= quantity;
                    } else if (selectionID.equalsIgnoreCase("Swift") && quantity <= swiftStock && quantity > 0) {
                        System.out.println("Added " + quantity + " Acer Swift 5 to cart.");
                        if(itemList.contains("AcerSwift5")){
                            quantity2 = quantityList.get(itemList.indexOf("AcerSwift5"));
                            quantityList.set(itemList.indexOf("AcerSwift5"),quantity + quantity2);
                        }else {
                            itemList.add("AcerSwift5");
                            quantityList.add(quantity);
                        }
                        swiftStock -= quantity;
                    } else if (selectionID.equalsIgnoreCase("Legion") && quantity <= 20 && quantity > 0) {
                        System.out.println("Added " + quantity + " Lenovo Legion PC to cart.");
                        if(itemList.contains("LenovoLegionPC")){
                            quantity2 = quantityList.get(itemList.indexOf("LenovoLegionPC"));
                            quantityList.set(itemList.indexOf("LenovoLegionPC"),quantity + quantity2);
                        }else {
                            itemList.add("LenovoLegionPC");
                            quantityList.add(quantity);
                        }
                        legionStock -= quantity;
                    } else {
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("decor")){
                //This is the decor section, which is pretty similar to the electronics section, just with different items.
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
                        if(itemList.contains("BedsideTable")){
                            quantity2 = quantityList.get(itemList.indexOf("BedsideTable"));
                            quantityList.set(itemList.indexOf("BedsideTable"),quantity + quantity2);
                        }else {
                            itemList.add("BedsideTable");
                            quantityList.add(quantity);
                        }
                        //I have to make sure that I am updating the remaining stock of the item after every addition.
                        bedsideStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("mirror") && quantity <= mirrorStock && quantity > 0){
                        System.out.println("Added " + quantity + " Mirror to cart.");
                        if(itemList.contains("OvalMirror")){
                            quantity2 = quantityList.get(itemList.indexOf("OvalMirror"));
                            quantityList.set(itemList.indexOf("OvalMirror"),quantity + quantity2);
                        }else {
                            itemList.add("OvalMirror");
                            quantityList.add(quantity);
                        }
                        mirrorStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("lamp") && quantity <= lampStock && quantity > 0){
                        System.out.println("Added " + quantity + " Lamp to cart.");
                        if(itemList.contains("TableLamp")){
                            quantity2 = quantityList.get(itemList.indexOf("TableLamp"));
                            quantityList.set(itemList.indexOf("TableLamp"),quantity + quantity2);
                        }else {
                            itemList.add("iPhone16");
                            quantityList.add(quantity);
                        }
                        lampStock -= quantity;
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("books")){
                // This is the books section, which has similar code to the other sections.
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
                        if(itemList.contains("JavaforDummies")){
                            quantity2 = quantityList.get(itemList.indexOf("JavaforDummies"));
                            quantityList.set(itemList.indexOf("JavaforDummies"),quantity + quantity2);
                        }else {
                            itemList.add("JavaforDummies");
                            quantityList.add(quantity);
                        }
                        javaDummiesStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("hobbit") && quantity <= hobbitStock && quantity > 0){
                        System.out.println("Added " + quantity + " Hobbit to cart.");
                        if(itemList.contains("TheHobbit")){
                            quantity2 = quantityList.get(itemList.indexOf("TheHobbit"));
                            quantityList.set(itemList.indexOf("TheHobbit"),quantity + quantity2);
                        }else {
                            itemList.add("TheHobbit");
                            quantityList.add(quantity);
                        }
                        hobbitStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("1984") && quantity <= nineteenStock && quantity > 0){
                        System.out.println("Added " + quantity + " 1984 to cart.");
                        if(itemList.contains("1984")){
                            quantity2 = quantityList.get(itemList.indexOf("1984"));
                            quantityList.set(itemList.indexOf("1984"),quantity + quantity2);
                        }else {
                            itemList.add("1984");
                            quantityList.add(quantity);
                        }
                        nineteenStock -= quantity;
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("music")){
                //This is the music section, which, again, is coded very similarly to the other sections.
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
                        if(itemList.contains("4YourEyezOnly")){
                            quantity2 = quantityList.get(itemList.indexOf("4YourEyezOnly"));
                            quantityList.set(itemList.indexOf("4YourEyezOnly"),quantity + quantity2);
                        }else {
                            itemList.add("4YourEyezOnly");
                            quantityList.add(quantity);
                        }
                        eyezOnlyStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("getup") && quantity <= getUpStock && quantity > 0){
                        System.out.println("Added " + quantity + " Get Up - NewJeans to cart.");
                        if(itemList.contains("GetUp")){
                            quantity2 = quantityList.get(itemList.indexOf("GetUp"));
                            quantityList.set(itemList.indexOf("GetUp"),quantity + quantity2);
                        }else {
                            itemList.add("GetUp");
                            quantityList.add(quantity);
                        }
                        getUpStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("bewitched") && quantity <= bewitchedStock && quantity > 0){
                        System.out.println("Added " + quantity + " Bewitched - Laufey to cart.");
                        if(itemList.contains("Bewitched")){
                            quantity2 = quantityList.get(itemList.indexOf("Bewitched"));
                            quantityList.set(itemList.indexOf("Bewitched"),quantity + quantity2);
                        }else {
                            itemList.add("Bewitched");
                            quantityList.add(quantity);
                        }
                        bewitchedStock -= quantity;
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("sports")){
                //Last but not least, there is the sports section, which is very similar to all the others.
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
                        if(itemList.contains("Astrox100Game")){
                            quantity2 = quantityList.get(itemList.indexOf("Astrox100Game"));
                            quantityList.set(itemList.indexOf("Astrox100Game"),quantity + quantity2);
                        }else {
                            itemList.add("Astrox100Game");
                            quantityList.add(quantity);
                        }
                        astroxStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("spaldingball") && quantity <= spaldingStock && quantity > 0){
                        System.out.println("Added " + quantity + " Spalding Indoor Basketball to cart.");
                        if(itemList.contains("SpaldingBasketball")){
                            quantity2 = quantityList.get(itemList.indexOf("SpaldingBasketball"));
                            quantityList.set(itemList.indexOf("SpaldingBasketball"),quantity + quantity2);
                        }else {
                            itemList.add("SpaldingBasketball");
                            quantityList.add(quantity);
                        }
                        spaldingStock -= quantity;
                    }else if(selectionID.equalsIgnoreCase("mikasa") && quantity <= mikasaStock && quantity > 0){
                        System.out.println("Added " + quantity + " Mikasa v360w Volleyball to cart.");
                        if(itemList.contains("MikasaVolleyball")){
                            quantity2 = quantityList.get(itemList.indexOf("MikasaVolleyball"));
                            quantityList.set(itemList.indexOf("MikasaVolleyball"),quantity + quantity2);
                        }else {
                            itemList.add("MikasaVolleyball");
                            quantityList.add(quantity);
                        }
                        mikasaStock -= quantity;
                    }else{
                        System.out.println("Invalid Quantity");
                    }
                }else{
                    System.out.println("Invalid selection");
                }
            }else if(category.equalsIgnoreCase("my cart") || category.equalsIgnoreCase("mycart")){
                System.out.println("Your Cart");
                //This is the cart section.
                System.out.println("Items");
                //This block prints out the items in the cart and the quantity, but not the cost.
                for(int i = 0; i < itemList.size(); i++){
                    System.out.println(itemList.get(i) + " (" + quantityList.get(i) + "), ");
                }
                System.out.println();
                //This block here is to fix a bug where after the cart screen reiterates, it will skip over the removal request.
                if(reiteration) {
                    sc.nextLine();
                }
                System.out.println("Would you like to remove any items from your cart?(Y/N)");
                input = sc.nextLine();
                if(input.equalsIgnoreCase("y")){
                    //The block below is for directly removing items from the cart.
                    System.out.println("Which item would you like to remove (enter it exactly as it appears in your cart.)?");
                    input = sc.nextLine();
                    switch(input.toLowerCase()){
                        case "iphone16":
                            iPhoneStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "acerswift5":
                            swiftStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "lenovolegionpc":
                            legionStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "bedsidetable":
                            bedsideStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "ovalmirror":
                            mirrorStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "tablelamp":
                            lampStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "javafordummies":
                            javaDummiesStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "thehobbit":
                            hobbitStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "1984":
                            nineteenStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "4youreyezonly":
                            eyezOnlyStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "getup":
                            getUpStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "bewitched":
                            bewitchedStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "astrox100game":
                            astroxStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "spaldingbasketball":
                            spaldingStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        case "mikasavolleyball":
                            mikasaStock += quantityList.remove(itemList.indexOf(input));
                            quantityList.remove(itemList.indexOf(input));
                            itemList.remove(input);
                            System.out.println("Item removed successfully.");
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                }
                System.out.println();
                System.out.println("Would you like to edit any of the quantities of your items (Y/N)");
                //I then ask the user whether they would like to edit the quantities of their items
                input = sc.nextLine();
                if(input.equalsIgnoreCase("Y")){
                    System.out.println("Which item's quantity would you like to change? (Enter the item exactly as it appears in your cart)");
                    //They must then input the item exactly as it appears in the arraylist.
                    input = sc.nextLine();
                    quantity = quantityList.get(itemList.indexOf(input));
                    //I then take the current quantity of the item, and if the arraylist contains the user's input, we continue.
                    if(itemList.contains(input)){
                        System.out.println("How many would you like to add?(use a negative integer for removal)");
                        quantity2 = sc.nextInt();
                        switch(input.toLowerCase()){
                            case "iphone16":
                                if(quantity2+quantity < iPhoneStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    iPhoneStock = iPhoneStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }

                                break;
                            case "acerswift5":
                                if(quantity2+quantity < swiftStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    swiftStock = swiftStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "lenovolegionpc":
                                if(quantity2+quantity < legionStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    legionStock = legionStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "bedsidetable":
                                if(quantity2+quantity < bedsideStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    bedsideStock = bedsideStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "ovalmirror":
                                if(quantity2+quantity < mirrorStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    mirrorStock = mirrorStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "tablelamp":
                                if(quantity2+quantity < lampStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    lampStock = lampStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "javafordummies":
                                if(quantity2+quantity < javaDummiesStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    javaDummiesStock = javaDummiesStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "thehobbit":
                                if(quantity2+quantity < hobbitStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    hobbitStock = hobbitStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "1984":
                                if(quantity2+quantity < nineteenStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    nineteenStock = nineteenStock + quantity2;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "4youreyezonly":
                                if(quantity2+quantity < eyezOnlyStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    eyezOnlyStock = eyezOnlyStock + quantity2;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "getup":
                                if(quantity2+quantity < getUpStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    getUpStock = getUpStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "bewitched":
                                if(quantity2+quantity < bewitchedStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    bewitchedStock = bewitchedStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "astrox100game":
                                if(quantity2+quantity < astroxStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    astroxStock = astroxStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "spaldingbasketball":
                                if(quantity2+quantity < spaldingStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    spaldingStock = spaldingStock + quantity2 ;
                                }else{
                                    System.out.println("Invalid Quantity Change");
                                }
                                break;
                            case "mikasavolleyball":
                                if(quantity2+quantity < mikasaStock && quantity2 + quantity > 0){
                                    System.out.println("Quantity Changed Successfully");
                                    quantityList.set(quantityList.indexOf(quantity),quantity + quantity2);
                                    mikasaStock = mikasaStock + quantity2 ;
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
                    reiteration = true;
                } else if (input.equalsIgnoreCase("N")) {
                    //This outputs the user's order.
                    System.out.println("Your order: ");
                    for(int i = 0; i < itemList.size(); i++){
                        input = itemList.get(i);
                        quantity = quantityList.get(i);
                        switch (input.toLowerCase()) {
                            case "iphone16":
                                System.out.println("iPhone 16 Pro Max 512 GB: " + quantity + " $" + Math.round(quantity*2049.99*100.0)/100.0);
                                subtotal2 += Math.round(quantity*2049.99*100.0)/100.0;
                                break;
                            case "acerswift5":
                                System.out.println("Acer Swift 5: " + quantity + " $" + Math.round(quantity*1499.99*100.0)/100.0);
                                subtotal2 += Math.round(quantity*1499.99*100.0)/100.0;
                                break;
                            case "lenovolegionpc":
                                System.out.println("Lenovo Legion PC: " + quantity + " $" + Math.round(quantity*2499.99*100.0)/100.0);
                                subtotal2 += Math.round(quantity*2499.99*100.0)/100.0;
                                break;
                            case "bedsidetable":
                                System.out.println("Bedside Table: " + quantity + " $" + Math.round(quantity*199.99*100.0)/100.0);
                                subtotal2 += Math.round(quantity*199.99*100.0)/100.0;
                                break;
                            case "ovalmirror":
                                System.out.println("Oval Mirror (Silver): " + quantity + " $" + Math.round(quantity*59.99*100.0)/100.0);
                                subtotal2 += Math.round(quantity*59.99*100.0)/100.0;
                                break;
                            case "tablelamp":
                                System.out.println("LED Table Lamp: " + quantity + " $" + Math.round(quantity*29.99*100.0)/100.0);
                                subtotal2 += Math.round(quantity*29.99*100.0)/100.0;
                                break;
                            case "javafordummies":
                                System.out.println("Java For Dummies: " + quantity + " $" +  Math.round(quantity*19.99*100.0)/100.0);
                                subtotal2 +=  Math.round(quantity*19.99*100.0)/100.0;
                                break;
                            case "thehobbit":
                                System.out.println("The Hobbit: " + quantity + " $" +  Math.round(quantity*29.99*100.0)/100.0);
                                subtotal2 +=  Math.round(quantity*29.99*100.0)/100.0;
                                break;
                            case "1984":
                                System.out.println("1984: " + quantity + " $" +  Math.round(quantity*9.99*100.0)/100.0);
                                subtotal2 +=  Math.round(quantity*9.99*100.0)/100.0;
                                break;
                            case "4youreyezonly":
                                System.out.println("4 Your Eyez Only - J.Cole: " + quantity + " $" +  Math.round(quantity*19.99*100.0)/100.0);
                                subtotal2 +=  Math.round(quantity*19.99*100.0)/100.0;
                                break;
                            case "getup":
                                System.out.println("Get Up - NewJeans: " + quantity + " $" +  Math.round(quantity*19.99*100.0)/100.0);
                                subtotal2 +=  Math.round(quantity*19.99*100.0)/100.0;
                                break;
                            case "bewitched":
                                System.out.println("Bewitched (Vinyl) - Laufey: " + quantity + " $" +  Math.round(quantity*29.99*100.0)/100.0);
                                subtotal2 +=  Math.round(quantity*29.99*100.0)/100.0;
                                break;
                            case "astrox100game":
                                System.out.println("Astrox 100 Game: " + quantity + " $" +  Math.round(quantity*149.99*100.0)/100.0);
                                subtotal2 +=  Math.round(quantity*149.99*100.0)/100.0;
                                break;
                            case "spaldingbasketball":
                                System.out.println("Spalding Indoor Basketball: " + quantity + " $" +  Math.round(quantity*59.99*100.0)/100.0);
                                subtotal2 +=  Math.round(quantity*59.99*100.0)/100.0;
                                break;
                            case "mikasavolleyball":
                                System.out.println("Mikasa v360w Volleyball: " + quantity + " $" +  Math.round(quantity*34.99*100.0)/100.0);
                                subtotal2 +=  Math.round(quantity*34.99*100.0)/100.0;
                                break;
                        }
                    }
                    //This is the checkout stage,where it displays their subtotal and total after tax.
                    System.out.println("Your subtotal is: $" + Math.round(subtotal2*100.0)/100.0);
                    System.out.println("Your total is: $" +  Math.round(subtotal2 * 1.13*100.0)/100.0);
                    System.out.println("Would you like to confirm your order?(Y/N)");
                    input = sc.nextLine();
                    if(input.equalsIgnoreCase("y")){
                        //confirms their order, and sets the completedOrder boolean to execute the completedOrder code. It redirects the user to the homepage.
                        System.out.println("Your order is confirmed");
                        completedOrder = true;
                        category = "homepage";
                    }
                }

            }else if(category.equalsIgnoreCase("admin login") || category.equalsIgnoreCase("AdminLogin")){
                //This is the admin screen, and it requires the user to enter a preset password.
                System.out.println("Admin Login");
                System.out.println("Enter Password (case sensitive): ");
                input = sc.nextLine();
                if(input.equals(password)){
                    //Welcomes the logged in admin, and displays the orders, along with their status.
                    System.out.println("Welcome, Admin");
                    System.out.println("Order List");
                    for(int i = 0;i < orderList.size();i++){
                        System.out.println(orderList.get(i) + "(" + shippedList.get(i) + ")");
                    }
                    System.out.println("Would you like to change the status of an order?(Y/N)");
                    //Allows them to change an order.
                    input = sc.nextLine();
                    if(input.equalsIgnoreCase("y")){
                        System.out.println("Which order would you like to edit? (Enter its place in the list, from top to bottom, the top being 0");
                        //Asks for the index of the desired order.
                        quantity = sc.nextInt();
                        if(quantity < orderList.size()){
                            System.out.println("This order is " + shippedList.get(quantity));
                            System.out.println("Would you like to change the status of an order?(Y/N)");
                            input = sc.nextLine();
                            //The block below changes the status of the desired order.
                            if(input.equalsIgnoreCase("y")){
                                if(shippedList.get(quantity).equals("not shipped")){
                                    shippedList.set(quantity, "shipped");
                                }else{
                                    shippedList.set(quantity, "not shipped");
                                }
                            }else if(input.equalsIgnoreCase("n")){
                                System.out.println("You have chosen to not edit this order.");
                            }
                        }else{
                            System.out.println("Invalid Input");
                        }
                    }
                    System.out.println("Edit Completed.");
                    System.out.println("Logging out...");
                    System.out.println("Redirecting you to homepage");
                }else{
                    System.out.println("Wrong Password");
                    System.out.println("Logging out...");
                    System.out.println("Redirecting you to the Homepage");
                }
                //Redirects the user to homepage
                category = "homepage";
            }else if(category.equalsIgnoreCase("exit")){
                //exit message, then breaks the loop, ending the program.
                System.out.println("Thanks for visiting Walmarket, see you soon!");
                break;
            }
            if(completedOrder){
                System.out.println("Thank you for shopping at Walmarket.");
                //Adds the entire cart to a single string.
                for(int i = 0; i < itemList.size(); i++){
                    order += (itemList.get(i) + ", (" + quantityList.get(i) + "), ");
                }
                //Adds the total of the order to said string.
                order += "(" + Math.round(subtotal2 * 1.13*100.0)/100.0 + ")";
                //Adds the cart to an arraylist of orders, as well as adds the "not shipped" status to a seperate arraylist.
                orderList.add(order);
                shippedList.add("not shipped");
                //Clears the string and the cart, as well as resets the completedOrder status
                order = "";
                itemList.clear();
                quantityList.clear();
                completedOrder = false;
            }
            if(category.equalsIgnoreCase("electronics") || category.equalsIgnoreCase("decor") || category.equalsIgnoreCase("books") || category.equalsIgnoreCase("music") || category.equalsIgnoreCase("sports")) {
                //Updates the user oon their cart contents
                System.out.println("Your cart contains: ");
                System.out.println();
                for (int i = 0; i < itemList.size(); i++) {
                    System.out.println(itemList.get(i) + " (" + quantityList.get(i) + ")" + ", ");
                }
                // Prompts the user to enter their desired category
                System.out.println("Where would you like to go now?");
                System.out.println("\t - Homepage \n \t - Electronics \n \t - Decor \n \t - Books \n \t - Music \n \t - Sports \n \t - My Cart \n \t - Admin Login \n \t - Exit");
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
                    case "exit":
                        System.out.println("Redirecting you to " + category);
                        break;
                    default:
                        //If the user enters an invalid category, it automatically redirects them to the homepage.
                        System.out.println("Invalid input");
                        System.out.println("Redirecting you to Home Page");
                        category = "homepage";
                        break;

                }
            }

        }

    }
}
