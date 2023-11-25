package th.mfu;

import org.springframework.data.repository.CrudRepository;

import th.mfu.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
    
}