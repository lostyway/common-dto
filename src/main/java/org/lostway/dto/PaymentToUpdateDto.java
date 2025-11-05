package org.lostway.dto;

import jakarta.validation.constraints.NotNull;
import org.lostway.enums.Currency;
import org.lostway.enums.PaymentStatus;

import java.math.BigDecimal;
import java.util.UUID;

public record PaymentToUpdateDto(
    @NotNull UUID paymentId,
    @NotNull UUID orderId,
    @NotNull UUID userId,
    BigDecimal amount,
    Currency currency,
    PaymentStatus status
) {
}
