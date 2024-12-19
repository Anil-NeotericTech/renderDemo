package com.neoteric.renderDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String dob;
    private String email;
    private String mobileNumber;
    private String name;
}
