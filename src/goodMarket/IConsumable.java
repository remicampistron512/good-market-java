package goodmarket;

import java.time.LocalDate;

public interface IConsumable {
    public boolean isRipe();
    public boolean isExpired(LocalDate dateVerification);
    public long daysRemainingBeforeExpiration(LocalDate dateVerification);
}
