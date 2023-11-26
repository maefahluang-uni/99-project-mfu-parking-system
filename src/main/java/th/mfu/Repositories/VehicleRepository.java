package th.mfu.Repositories;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;

import th.mfu.Domain.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
    
    
}