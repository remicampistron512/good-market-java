package goodMarket;

import java.time.LocalDate;

public abstract class Product {
    protected String name;
    protected double unitPrice;
    protected String unit;
    protected double stockQuantity;
    protected LocalDate pickingDate;
    protected  int shelfLifeDays;

}
