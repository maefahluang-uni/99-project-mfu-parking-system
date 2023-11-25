package th.mfu.Repositories;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;

import th.mfu.Domain.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
    List<
    
}