package com.app.payloads;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JWTAuthRequest {
    String username;  // email
    String password;
}