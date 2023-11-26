package th.mfu.Repositories;

import java.util.List;
import java.util.Optional;

import th.mfu.Domain.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Integer> {
    List<Visitor> findByVisitorID(int visitorID);    
    Optional<Visitor> findByphonenumb(Object phonenumb);


}