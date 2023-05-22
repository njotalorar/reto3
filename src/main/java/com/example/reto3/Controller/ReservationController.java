package com.example.reto3.Controller;

import com.example.reto3.Model.Reservation;
import com.example.reto3.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*") //acepte todas las peticiones entrantes
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @GetMapping( "/all")  //
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }

    @GetMapping( "/{id}")
    public Optional<Reservation> getReservation(@PathVariable int id){
        return reservationService.getReservation(id);
    }
    @PostMapping( "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation Save(@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }

}
