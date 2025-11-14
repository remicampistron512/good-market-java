package goodmarket;

import java.time.LocalDate;

public class Fruit extends Product implements IConsumable{
    protected Fruit(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays) {
        super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
    }

    @Override
    public boolean isExpired(LocalDate dateVerification) {
        return false;
    }

    @Override
    public boolean isRipe() {
        return false;
    }

    @Override
    public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
        return 0;
    }

}
