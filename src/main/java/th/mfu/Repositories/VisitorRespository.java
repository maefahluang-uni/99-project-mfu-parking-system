package th.mfu.Repositories;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;

import th.mfu.Domain.Visitor;

public interface VisitorRespository extends CrudRepository<Visitor, Integer> {
    Visitor findbyIdVisitor(String phonenumb);

    Optional<Visitor> findByphonenumb(Object phonenumb);

    java.util.List<Visitor> findByvisitorID(Integer visitorid);
    
}