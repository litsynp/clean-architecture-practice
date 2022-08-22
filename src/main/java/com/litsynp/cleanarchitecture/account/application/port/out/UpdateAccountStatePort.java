package com.litsynp.cleanarchitecture.account.application.port.out;

import com.litsynp.cleanarchitecture.account.domain.Account;

public interface UpdateAccountStatePort {

    void updateActivities(Account account);

}
