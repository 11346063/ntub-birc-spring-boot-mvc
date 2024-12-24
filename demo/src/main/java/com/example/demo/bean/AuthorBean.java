package com.example.demo.bean;


import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AuthorBean {

    @Null
    private Integer id;

    @NotBlank(message = "Name Is Null")
    @Size(max = 45, message = "name size < 45")
    private String name;

    @NotBlank(message = "Birthdate Is Null")
    private String birthdateStr;

    private LocalDate birthdate;

}
