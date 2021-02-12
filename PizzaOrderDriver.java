/* Name: Cole Ternes
 * ID: 2323955
 * Description: Is the driver for the class that creates the order for some pipin' hot pizzas
 */

import java.util.Scanner;

public class PizzaOrderDriver {
  //Main Method
  public static void main(String[] args) {
    //Creating Objects
    Scanner sin = new Scanner(System.in);
    PizzaOrder p_order = new PizzaOrder();
    Pizza p1 = new Pizza();
    Pizza p2 = new Pizza();
    Pizza p3 = new Pizza();

    //Prompts user to enter the number of pizzas in the order
    System.out.println("Enter the number of pizzas you want to order (1-3): ");
    int orderNum = sin.nextInt();
    String spacing = sin.nextLine();
    p_order.setNumPizzas(orderNum);

    //For-Loop to iterate through and add specifications to each pizza
    for (int i = 0; i < orderNum; i++) {
      if (i == 0) {
        System.out.println("\n\n\n\n\n\n\n\t\tPIZZA #1\nEnter the Size (Small/Medium/Large): ");
        p1.setSize(sin.nextLine());
        System.out.println("Enter the Number of Cheese Toppings: ");
        p1.setCheese(sin.nextInt());
        System.out.println("Enter the Number of Pepperoni Toppings: ");
        p1.setPepperoni(sin.nextInt());
        System.out.println("Enter the Number of Ham Toppings: ");
        p1.setHam(sin.nextInt());
        spacing = sin.nextLine();
        p_order.setPizza1(p1);
      }
      else if (i == 1) {
        System.out.println("\n\n\n\n\n\n\n\t\tPIZZA #2\nEnter the Size (Small/Medium/Large): ");
        p2.setSize(sin.nextLine());
        System.out.println("Enter the Number of Cheese Toppings: ");
        p2.setCheese(sin.nextInt());
        System.out.println("Enter the Number of Pepperoni Toppings: ");
        p2.setPepperoni(sin.nextInt());
        System.out.println("Enter the Number of Ham Toppings: ");
        p2.setHam(sin.nextInt());
        spacing = sin.nextLine();
        p_order.setPizza2(p2);
      }
      else if (i == 2) {
        System.out.println("\n\n\n\n\n\n\n\t\tPIZZA #3\nEnter the Size (Small/Medium/Large): ");
        p3.setSize(sin.nextLine());
        System.out.println("Enter the Number of Cheese Toppings: ");
        p3.setCheese(sin.nextInt());
        System.out.println("Enter the Number of Pepperoni Toppings: ");
        p3.setPepperoni(sin.nextInt());
        System.out.println("Enter the Number of Ham Toppings: ");
        p3.setHam(sin.nextInt());
        spacing = sin.nextLine();
        p_order.setPizza3(p3);
      }
    }

    //Prints out the results
    double total = p_order.calcTotal(p_order);
    String orderDesc = "\n--------------------------------\nPIZZA #1\n" + p1.getDescription();
    if (orderNum >= 2) {
      orderDesc += "\n--------------------------------\nPIZZA #2\n" + p2.getDescription();
    }
    if (orderNum >= 2) {
      orderDesc += "\n--------------------------------\nPIZZA #3\n" + p3.getDescription();
    }
    orderDesc += "\n--------------------------------\nGRAND TOTAL: $";
    orderDesc += String.format("%.2f", total);
    System.out.println(orderDesc);
  }
}
