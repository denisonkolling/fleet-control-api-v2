package com.fleetcontrol.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.fleetcontrol.dto.DriverRequest;
import com.fleetcontrol.model.Driver;
import com.fleetcontrol.repository.DriverRepository;
import com.fleetcontrol.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

    private DriverRepository driverRepository;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public Driver createDriver(DriverRequest driverRequest) {

        Driver driver = new Driver();
        BeanUtils.copyProperties(driverRequest, driver);
        return driverRepository.save(driver);
    }

}
