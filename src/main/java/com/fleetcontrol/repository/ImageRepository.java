package com.fleetcontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleetcontrol.model.Image;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{
  
}
