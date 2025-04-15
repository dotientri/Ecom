package com.app.payloads;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderItemDTO {
	 Long orderItemId;
	 ProductDTO product;
	 Integer quantity;
	 double discount;
	 double orderedProductPrice;
}
