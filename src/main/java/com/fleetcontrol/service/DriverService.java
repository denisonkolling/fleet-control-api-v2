package com.fleetcontrol.service;

import com.fleetcontrol.dto.DriverRequest;
import com.fleetcontrol.model.Driver;

public interface DriverService {

    Driver createDriver(DriverRequest driver);

}
