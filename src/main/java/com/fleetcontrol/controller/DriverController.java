package com.fleetcontrol.controller;

import com.fleetcontrol.dto.DriverRequest;
import com.fleetcontrol.service.DriverService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping("/driver")
    public ResponseEntity<?> createDriver(@RequestBody @Valid DriverRequest driverRequest) {
        return new ResponseEntity<>(driverService.createDriver(driverRequest), HttpStatus.CREATED);
    }

}
