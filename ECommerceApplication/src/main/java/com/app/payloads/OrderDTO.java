package com.app.payloads;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDTO {
    Long orderId;
    String email;
    List<OrderItemDTO> orderItems = new ArrayList<>();
    LocalDate orderDate;
    PaymentDTO payment;
    Double totalAmount;
    String orderStatus;
}
