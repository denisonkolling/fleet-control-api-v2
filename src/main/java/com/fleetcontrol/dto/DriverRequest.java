package com.fleetcontrol.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverRequest {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Past
    private LocalDate birthday;

    @NotBlank
    private String nationality;

    @NotBlank
    private String licenseId;

    @NotBlank
    private String licenseClass;

    @Future
    private LocalDate licenseExpiryDate;

    private String profileImageId;

}
