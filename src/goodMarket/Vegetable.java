package goodmarket;

import java.time.LocalDate;

public class Vegetable extends Product implements IConsumable{
    protected Vegetable(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays) {
        super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
    }

    @Override
    public boolean isRipe() {
        return false;
    }

    @Override
    public boolean isExpired(LocalDate dateVerification) {
        return false;
    }

    @Override
    public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
        return 0;
    }
}
