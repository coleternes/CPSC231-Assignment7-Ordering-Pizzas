/* Name: Cole Ternes
 * ID: 2323955
 * Description: Creates the order for some pipin' hot pizzas
 */

public class PizzaOrder {
  //Member Variables
  private int m_num_pizzas;
  private Pizza[] m_order;

  //Default Constructor
  public PizzaOrder() {
    m_num_pizzas = 0;
    m_order = new Pizza[m_num_pizzas];
  }

  //Overloaded Constructor
  public PizzaOrder(int numPizzas) {
    m_num_pizzas = numPizzas;
    m_order = new Pizza[m_num_pizzas];
  }

  //Copy Constructor
  public PizzaOrder(PizzaOrder po) {
    m_num_pizzas = po.m_num_pizzas;
    m_order = new Pizza[m_num_pizzas];
    for (int i = 0; i < m_num_pizzas; i++) {
      m_order[i] = po.m_order[i];
    }
  }

  //Mutators & Accessors
  //Num Pizzas
  public int getNumPizzas() {
    return m_num_pizzas;
  }
  public void setNumPizzas(int numPizzas) {
    m_num_pizzas = numPizzas;
    m_order = new Pizza[m_num_pizzas];
  }
  //Pizza 1
  public Pizza getPizza1() {
    return m_order[0];
  }
  public void setPizza1(Pizza pizza1) {
    Pizza p1 = new Pizza(pizza1);
    m_order[0] = p1;
  }
  //Pizza 2
  public Pizza getPizza2() {
    if (m_num_pizzas >= 2) {
      return m_order[1];
    }
    else {
      return null;
    }
  }
  public void setPizza2(Pizza pizza2) {
    if (m_num_pizzas >= 2) {
      Pizza p2 = new Pizza(pizza2);
      m_order[1] = p2;
    }
  }
  //Pizza 3
  public Pizza getPizza3() {
    if (m_num_pizzas >= 3) {
      return m_order[2];
    }
    else {
      return null;
    }
  }
  public void setPizza3(Pizza pizza3) {
    if (m_num_pizzas >= 3) {
      Pizza p3 = new Pizza(pizza3);
      m_order[2] = p3;
    }
  }

  //Returns the total cost of the order
  public double calcTotal(PizzaOrder po) {
    double total = 0.0;
    total += getPizza1().calcCost();
    if (m_num_pizzas >= 2) {
      total += getPizza2().calcCost();
    }
    if (m_num_pizzas >= 3) {
      total += getPizza3().calcCost();
    }
    return total;
  }
}
