package com.hom.user.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Administrator
 * @version 1.0
 **/
@Data
@AllArgsConstructor
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
}
