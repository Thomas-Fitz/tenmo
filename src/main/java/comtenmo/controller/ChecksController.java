package comtenmo.controller;

import comtenmo.dao.AccountDao;
import comtenmo.dao.TransactionDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Controller to verify that transfers can be done.
 */

@Component
public class ChecksController {
    private TransactionDao transactionDao;
    private AccountDao accountDao;
    private JdbcTemplate jdbcTemplate;


    public ChecksController(TransactionDao transactionDao, AccountDao accountDao) {
        this.transactionDao = transactionDao;
        this.accountDao = accountDao;
    }

    public boolean enoughMoney(int userId, BigDecimal transactionAmount){
        if (accountDao.getBalanceByUserId(userId).compareTo(transactionAmount) < 0){
            return false;
        }
        return true;
    }

    public boolean userIdsAreDifferent(int fromUser, int toUser){
        if (fromUser == toUser){
            return false;
        } return true;
    }
}
