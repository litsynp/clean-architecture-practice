package com.litsynp.cleanarchitecture.account.application.port.out;

import com.litsynp.cleanarchitecture.account.domain.Account;
import com.litsynp.cleanarchitecture.account.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);

}
