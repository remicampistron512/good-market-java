package goodmarket;

import java.util.ArrayList;
import java.util.List;

public class Order
{
  protected static List<Object> lineOrders = new ArrayList<>();
  public Order() {
    // TODO document why this constructor is empty
  }
  public void addLineOrder(LineOrder lineOrder){
    lineOrders.add(lineOrder);
  }


}
