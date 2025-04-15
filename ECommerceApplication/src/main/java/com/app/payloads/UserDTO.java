package com.app.payloads;

import java.util.HashSet;
import java.util.Set;

import com.app.entites.Role;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDTO {
    Long userId;
    String firstName;
    String lastName;
    String mobileNumber;
    String email;
    String password;
    Set<Role> roles = new HashSet<>();
    AddressDTO address;
    CartDTO cart;
}
