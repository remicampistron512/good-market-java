package goodmarket;

import java.time.LocalDate;

public abstract class Product {
    protected String name;
    protected double unitPrice;
    protected String unit;
    protected double stockQuantity;
    protected LocalDate pickingDate;
    protected  int shelfLifeDays;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getUnit() {
        return unit;
    }

    public double getStockQuantity() {
        return stockQuantity;
    }

    public LocalDate getPickingDate() {
        return pickingDate;
    }

    public int getShelfLifeDays() {
        return shelfLifeDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setStockQuantity(double stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setPickingDate(LocalDate pickingDate) {
        this.pickingDate = pickingDate;
    }

    public void setShelfLifeDays(int shelfLifeDays) {
        this.shelfLifeDays = shelfLifeDays;
    }
}
