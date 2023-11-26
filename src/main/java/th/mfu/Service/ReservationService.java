package th.mfu.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import th.mfu.Domain.Reservation;
import th.mfu.Repositories.ReservationRepository;

@Service
public class ReservationService {

    private ReservationRepository repository;

    private ReservationService(ReservationRepository repository){
        this.repository = repository;
    }

    public List<Reservation> findAll(){
        return repository.findAll();
    }

    public List<Reservation> findByUserId(Integer userId){
        return repository.findByUserID(userId);
    }

    public Reservation createReservation(Reservation reservation){
        return repository.save(reservation);
    }

    public Reservation updateReservation(Reservation reservation){
        var reservationData = new Reservation();
        reservationData.setReserId(reservation.getReserId());

        return repository.save(reservationData);
    }

    public void deleteReservation(Integer userId){
        repository.deleteById(userId);
    }
}