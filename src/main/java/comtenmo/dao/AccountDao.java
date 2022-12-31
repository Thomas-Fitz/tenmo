package comtenmo.dao;

import java.math.BigDecimal;

public interface AccountDao {

    BigDecimal addToBalance(int accountId, BigDecimal amount);

    BigDecimal subtractFromBalance(int accountId, BigDecimal amount);

    BigDecimal getBalanceByUserId(int userId);

}
