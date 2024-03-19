package com.fleetcontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fleetcontrol.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
  
  public Driver findByLicenseId(String licenseId);

  @Query
  ("SELECT d FROM Driver d WHERE d.firstName ILIKE CONCAT('%', :name, '%') OR d.lastName ILIKE CONCAT('%', :name, '%')")
  public Driver findByFirstNameOrLastName(@Param("name") String name);

}
