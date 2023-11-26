package th.mfu.Repositories;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;

import th.mfu.Domain.Visitor;

public interface VisitorRespository extends CrudRepository<Visitor, Integer> {
    
    
}