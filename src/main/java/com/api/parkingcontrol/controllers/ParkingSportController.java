package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.services.ParkingSpotService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-sport")
public class ParkingSportController {

    final ParkingSpotService parkingSpotService;

    public ParkingSportController(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }


}
