package th.mfu.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import th.mfu.Domain.Reservation;
import th.mfu.Domain.Reservationmanage;

@RestController
@RequestMapping("reservation")
public class ReservationController {

    private Reservationmanage ReservationService;

    private ReservationController(Reservationmanage reservationService){
        this.ReservationService = reservationService;
    }


    @GetMapping(produces = "application/json")
    public List<Reservation> findAll(){
        return ReservationService.findAll();
    }

    //Path variable
    @GetMapping(value = "/findByUserId/{id}",produces = "application/json")
    public List<Reservation> findByUserId(@PathVariable Integer id){
        return ReservationService.findByUserId(id);
    }
    
    //Query Variable
    @GetMapping(value = "/findByUserId",produces = "application/json")
    public List<Reservation> findByUserIdQuery(@RequestParam Integer id){
        return ReservationService.findByUserId(id);
    }

    @PostMapping(produces = "application/json")
    public Reservation createReservation(Reservation reservation){
        return ReservationService.createReservation(reservation);
    }

    @PutMapping(produces = "application/json")
    public Reservation updateReservations(Reservation reservation){
        return ReservationService.updateReservation(reservation);
    }

    @DeleteMapping(produces = "application/json")
    public List<Reservation> deleteReservations(@PathVariable Integer id){
        return ReservationService.findByUserId(id);
    }
}