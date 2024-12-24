package com.example.demo.bean;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class BookBean {

    @Null
    private Integer id;

    @NotNull(message = "Author Id Is Null")
    private Integer authorId;

    @NotBlank(message = "Title Is Null")
    @Size(max = 50, message = "Title Size < 50")
    private String title;

    @NotBlank(message = "Content Is Null")
    @Size(max = 200, message = "Content Size < 200")
    private String content;
}
