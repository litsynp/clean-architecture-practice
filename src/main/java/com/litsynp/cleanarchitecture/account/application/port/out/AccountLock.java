package com.litsynp.cleanarchitecture.account.application.port.out;

import com.litsynp.cleanarchitecture.account.domain.Account.AccountId;

public interface AccountLock {

    void lockAccount(AccountId accountId);

    void releaseAccount(AccountId accountId);

}
