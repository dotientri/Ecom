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
public class ProductDTO {
	 Long productId;
	 String productName;
	 String image;
	 String description;
	 Integer quantity;
	 double price;
	 double discount;
	 double specialPrice;
}
