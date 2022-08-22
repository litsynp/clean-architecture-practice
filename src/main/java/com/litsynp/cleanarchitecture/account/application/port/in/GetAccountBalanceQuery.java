package com.litsynp.cleanarchitecture.account.application.port.in;

import com.litsynp.cleanarchitecture.account.domain.Account.AccountId;
import com.litsynp.cleanarchitecture.account.domain.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(AccountId accountId);

}
