package com.litsynp.cleanarchitecture.account.domain;

import com.litsynp.cleanarchitecture.account.domain.Account.AccountId;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@RequiredArgsConstructor
public class Activity {

    ActivityId id;

    @NonNull
    AccountId ownerAccountId;

    @NonNull
    AccountId sourceAccountId;

    @NonNull
    AccountId targetAccountId;

    @NonNull
    LocalDateTime timestamp;

    @NonNull
    Money money;

    public Activity(
            @NonNull AccountId ownerAccountId,
            @NonNull AccountId sourceAccountId,
            @NonNull AccountId targetAccountId,
            @NonNull LocalDateTime timestamp,
            @NonNull Money money) {
        this.id = null;
        this.ownerAccountId = ownerAccountId;
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.timestamp = timestamp;
        this.money = money;
    }

    @Value
    public static class ActivityId {
        Long value;
    }
}
