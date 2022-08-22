package com.litsynp.cleanarchitecture.account.application.service;

import com.litsynp.cleanarchitecture.account.application.port.out.AccountLock;
import com.litsynp.cleanarchitecture.account.domain.Account.AccountId;
import org.springframework.stereotype.Component;

@Component
class NoOpAccountLock implements AccountLock {

    @Override
    public void lockAccount(AccountId accountId) {
        // do nothing
    }

    @Override
    public void releaseAccount(AccountId accountId) {
        // do nothing
    }

}
