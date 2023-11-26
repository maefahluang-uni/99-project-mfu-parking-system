import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.mfu.Domain.Reservation;
import th.mfu.Repositories.ReservationRepository;

@Service
public class ReservationService {

    private final ReservationRepository repository;

    @Autowired
    public ReservationService(ReservationRepository repository) {
        this.repository = repository;
    }

    public List<Reservation> findAll() {
        return null;
    }

    public List<Reservation> findByVisitorId(Integer id) {
        return null;
    }

    public Reservation createReservation(Reservation reservation) {
        return null;
    }

   
}