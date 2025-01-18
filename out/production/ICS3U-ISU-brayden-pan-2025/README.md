# ICS3U-ISU-brayden-pan-2025
Repository for Grade 11 Computer Science ISU

### 1. Browse Product Categories
The Homepage displays all categories, including the cart, admin login, and the exit.
It prompts the user to enter a category they would like to visit.
### 2. Browse Products
Access to each category was determined by a variable called category.
Each category was under an if statement whose condition was the value of category
The UI for each category is the same for all categories, with the title, items, and then prompting the user to select an item.
My selection method was giving each item a selection ID, since it is easier to type out than the full name of the item.
### 3. Add Products to Cart
After entering a valid selection ID, the user is then prompted to enter the desired quantity of the product. 
If the quantity exceeds the available stock, it will display an error message.
The cart is then shown after the addition process, just before the menu.
### 4. Update Cart Items
In the cart screen, the user is prompted to enter whether they would like to edit any of the quantities in their cart.
Afterward, the user enters the amount they want to edit it by (negative if they want to remove) and the program validates that the new sum/difference is above 0 and doesn't exceed the total stock.
After the edit, the stock is edited by the quantity of the edit.
It then displays the cart.
### 5. Remove Products from Cart
In the cart screen, just before the quantity change step, the program asks the user whether they would like to remove items.
If the user answers yes, they select which item to remove.
The program then adds the quantity of the item in the cart back to the stock, then clears the item and quantity from the cart.
The program then displays the updated cart.
### 6. Checkout
After confirming with the user that they would not like to update the cart in any way, the program displays the cart.
The program then displays the subtotal and the total, and prompts the user to confirm the order.
If the user confirms the order, it starts the completedOrder protocol, which thanks the user for shopping, then adds the whole order to a new arraylist holding all the past orders, and then clears the cart.
The user is then redirected to the homepage.
If the user doesn't confirm the order, they are redirected back to the homepage.
### 7. View Orders
Alongside the categories, the cart, and the exit option, there is an additional admin login option.
This admin login option, if the password is entered correctly, allows access to the view order menu.
The admin can then choose to edit the status of specific order, whether shipped or not shipped.
### 8. Exit Program
After choosing to exit the program, the program displays a farewell message, and breaks the loop, ending the program.
### 9. Menu Options
There is aa menu that appears after every selection, that looks very similar to the homepage, and prompts the user similarly. If the user does not enter a valid category, it redirects them to the homepage.
