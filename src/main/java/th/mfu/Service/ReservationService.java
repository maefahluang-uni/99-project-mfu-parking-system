import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.mfu.Repositories.ReservationRepository;

@Service
public class ReservationService {

    private final ReservationRepository repository;

    @Autowired
    public ReservationService(ReservationRepository repository) {
        this.repository = repository;
    }

   
}