# Smart Restaurant Order

A simple Java console application that simulates placing an order at a restaurant. It collects customer details, lets the customer select a meal and drinks, applies an eligible discount, calculates a tip based on the service rating, and prints an itemized receipt.

## Features

- Displays food and drink menus with prices.
- Collects the customer's name, age, student status, drink quantity, and service rating.
- Applies a **10% student discount** or a **5% senior discount** for customers aged 60 or older. If a customer qualifies for both, the student discount is used.
- Adds a **10% tip** when the service rating is 4 or 5; ratings from 1 to 3 do not add a tip.
- Checks menu selections, drink quantity, and service rating for valid input.
- Prints the order totals and a final receipt.



## Menu

### Meals

| Option | Meal | Price |
| --- | --- | ---: |
| 1 | Burger | $8.00 |
| 2 | Pizza | $12.00 |
| 3 | Chicken | $15.00 |

### Drinks

| Option | Drink | Price per drink |
| --- | --- | ---: |
| 1 | Water | $1.00 |
| 2 | Coffee | $3.00 |
| 3 | Soda | $2.00 |

## How the total is calculated

1. Drinks cost = number of drinks × price per drink.
2. Subtotal = meal price + drinks cost.
3. The applicable discount is deducted from the subtotal.
4. A 10% tip on the subtotal is added for a service rating of 4 or 5.
5. The program displays the final bill and a whole-dollar amount. The whole-dollar amount is produced by converting the total to an integer, which truncates the decimal portion.

## Example interaction

The program prompts for a customer name and age, a meal and drink selection, the number of drinks, whether the customer is a student, and a service rating from 1 to 5. It then displays a receipt with the calculated meal, drink, discount, tip, and final bill.

## output example
<img width="595" height="585" alt="image" src="https://github.com/user-attachments/assets/b097e70c-2fe0-4dec-9422-fac294fe3703" />


<img width="1109" height="759" alt="image" src="https://github.com/user-attachments/assets/7c92e8a9-70a0-4a50-b0b3-76ffeedf150e" />

<img width="791" height="686" alt="image" src="https://github.com/user-attachments/assets/de09450d-b368-4a4a-b8a3-2536ba8f9264" />

<img width="713" height="375" alt="image" src="https://github.com/user-attachments/assets/45075cd0-a1eb-4cc5-8b5a-f0265f1e99a0" />





## Learning topics

This project demonstrates Java variables and data types, console input with `Scanner`, conditional statements, logical operators, arithmetic, constants, and formatted output.

## Learning resources

- [Telusko — Java Tutorial](https://www.youtube.com/playlist?list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5)
- [W3Schools — Java Tutorial](https://www.w3schools.com/java/default.asp)

  
