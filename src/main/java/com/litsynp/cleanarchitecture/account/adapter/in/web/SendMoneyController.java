package com.litsynp.cleanarchitecture.account.adapter.in.web;

import com.litsynp.cleanarchitecture.account.application.port.in.SendMoneyCommand;
import com.litsynp.cleanarchitecture.account.application.port.in.SendMoneyUseCase;
import com.litsynp.cleanarchitecture.account.domain.Account.AccountId;
import com.litsynp.cleanarchitecture.account.domain.Money;
import com.litsynp.cleanarchitecture.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
class SendMoneyController {

    private final SendMoneyUseCase sendMoneyUseCase;

    @PostMapping("/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
    void sendMoney(
            @PathVariable Long sourceAccountId,
            @PathVariable Long targetAccountId,
            @PathVariable Long amount
    ) {
        SendMoneyCommand command = new SendMoneyCommand(
                new AccountId(sourceAccountId),
                new AccountId(targetAccountId),
                Money.of(amount)
        );

        sendMoneyUseCase.sendMoney(command);
    }

}
