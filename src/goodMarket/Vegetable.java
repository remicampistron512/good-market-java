package goodmarket;

import java.time.LocalDate;

public class Vegetable extends Product implements IConsumable{
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
