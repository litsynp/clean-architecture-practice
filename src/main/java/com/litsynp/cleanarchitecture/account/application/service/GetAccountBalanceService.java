package com.litsynp.cleanarchitecture.account.application.service;

import com.litsynp.cleanarchitecture.account.application.port.in.GetAccountBalanceQuery;
import com.litsynp.cleanarchitecture.account.application.port.out.LoadAccountPort;
import com.litsynp.cleanarchitecture.account.domain.Account.AccountId;
import com.litsynp.cleanarchitecture.account.domain.Money;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}
