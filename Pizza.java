/* Name: Cole Ternes
 * ID: 2323955
 * Description: Creates some pipin' hot pizzas
 */

public class Pizza {
  //Member Variables
  private String m_size; //Small, Medium, Large
  private int m_cheese;
  private int m_pepperoni;
  private int m_ham;

  //Default Constructor
  public Pizza() {
    m_size = " ";
    m_cheese = -1;
    m_pepperoni = -1;
    m_ham = -1;
  }

  //Overloaded Constructor
  public Pizza(String size, int cheese, int pepperoni, int ham) {
    m_size = size;
    m_cheese = cheese;
    m_pepperoni = pepperoni;
    m_ham = ham;
  }

  //Copy Constructor
  public Pizza(Pizza p) {
    m_size = p.m_size;
    m_cheese = p.m_cheese;
    m_pepperoni = p.m_pepperoni;
    m_ham = p.m_ham;
  }

  //Mutators & Accessors
  //Size
  public String getSize() {
    return m_size;
  }
  public void setSize(String size) {
    m_size = size;
  }
  //Cheese
  public int getCheese() {
    return m_cheese;
  }
  public void setCheese(int cheese) {
    m_cheese = cheese;
  }
  //Pepperoni
  public int getPepperoni() {
    return m_pepperoni;
  }
  public void setPepperoni(int pepperoni) {
    m_pepperoni = pepperoni;
  }
  //Ham
  public int getHam() {
    return m_ham;
  }
  public void setHam(int ham) {
    m_ham = ham;
  }

  //Other Methods
  public double calcCost() {
    double cost = 0.0;
    if (m_size.equalsIgnoreCase("small")) {
      cost = 10 + (2 * m_cheese) + (2 * m_pepperoni) + (2 * m_ham);
    } else if (m_size.equalsIgnoreCase("medium")) {
      cost = 12 + (2 * m_cheese) + (2 * m_pepperoni) + (2 * m_ham);
    } else if (m_size.equalsIgnoreCase("large")) {
      cost = 14 + (2 * m_cheese) + (2 * m_pepperoni) + (2 * m_ham);
    }
    return cost;
  }

  public String getDescription() {
    double cost = calcCost();
    String s = "";
    s += "Size: " + m_size;
    s += "\nNumber of Cheese Toppings: " + m_cheese;
    s += "\nNumber of Pepperoni Toppings: " + m_pepperoni;
    s += "\nNumber of Ham Toppings: " + m_ham;
    s += "\nCost: $";
    s += String.format("%.2f", cost);
    return s;
  }
}
