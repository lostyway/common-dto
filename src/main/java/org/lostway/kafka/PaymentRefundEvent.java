package org.lostway.kafka;

import org.lostway.enums.Currency;
import org.lostway.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record PaymentRefundEvent(
    UUID id,
    UUID orderId,
    BigDecimal amount,
    Currency currency,
    PaymentStatus status,
    Instant createdAt,
    Instant sentAt
) {}
