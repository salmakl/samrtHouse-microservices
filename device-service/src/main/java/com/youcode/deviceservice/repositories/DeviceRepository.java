package com.youcode.deviceservice.repositories;

import com.youcode.deviceservice.entities.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository extends MongoRepository<Device,String> {
}