package org.lostway.dto;

import org.lostway.enums.Currency;
import org.lostway.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record PaymentToShowDto(
    UUID id,
    UUID orderId,
    UUID userId,
    BigDecimal amount,
    Currency currency,
    PaymentStatus status,
    Instant createdAt,
    Instant updatedAt
) {}