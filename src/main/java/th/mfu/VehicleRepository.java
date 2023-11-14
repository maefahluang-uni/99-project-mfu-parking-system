package th.mfu;

import org.springframework.data.repository.CrudRepository;

import th.mfu.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
    
}