package th.mfu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import th.mfu.Domain.Visitor;
import th.mfu.Repositories.VisitorRepository;

@Service
public class VisitorService {

    private static VisitorRepository repository;

    private VisitorService(VisitorRepository repository){
        VisitorService.repository = repository;
    }

    public List<th.mfu.Domain.Visitor> findAll(){
        return (List<Visitor>) repository.findAll();
    }

    public List<th.mfu.Domain.Visitor> findByUserId(Integer visitorid){
        return repository.findByVisitorID(visitorid);
    }

    public void deleteUser(Integer userId){
        repository.deleteById(userId);
    }

    public static boolean isValidUser(String phonenumb) {
        Optional<Visitor> userOptional = repository.findByphonenumb( phonenumb);
        return userOptional.isPresent();
    }
}