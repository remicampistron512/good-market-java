package goodmarket;

import java.time.LocalDate;

public class LineOrder extends Product{
    int quantity;
    public LineOrder(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays,int quantity){
        super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
        this.quantity = quantity;

    }

}
