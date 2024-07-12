package com.datricle.web.springbootwebtutorial.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;

    //@NotNull(message = "Required field in Employee: name")
    //@NotEmpty(message = "Name of the employee can not be empty")
    @NotBlank(message = "Name of the employee can not be empty")
    @Size(min = 3, max = 10, message = "Numbers of char in name should be in the range:[3,10]")
    private String name;

    @Email(message = "Email should be valid for eg: abc@gmail.com")
    private String email;

    @Max(value = 80, message = "age cannot be greater than 80")
    @Min(value = 18, message = "age cannot be less than 18")
    private Integer age;

    @NotBlank(message = "The role of the employee can not be blank")
    @Pattern(regexp = "^(ADMIN|USER)$", message = "Role of Employee can be USER or ADMIN")
    private String role; //Admin,user

    @NotNull(message = "Salary of Employee should be not null")
    @Positive(message = "Salary of Employee should be positive")
    @Digits(integer = 6, fraction = 2, message = "The salary can be in the form XXXXX.YY")
    private Double salary;

    @PastOrPresent(message = "DateOfJoining field in Employee cannot be in the future")
    private LocalDate dateOfJoining;

    @JsonProperty("isActive")
    private Boolean isActive;
}