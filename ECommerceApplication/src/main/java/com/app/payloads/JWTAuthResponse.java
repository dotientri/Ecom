package com.app.payloads;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JWTAuthResponse {
    String token;
    UserDTO user;
}