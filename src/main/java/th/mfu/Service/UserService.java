package th.mfu.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import th.mfu.Domain.User;
import th.mfu.Repositories.UserRepository;

@Service
public class UserService {

    private static UserRepository repository;

    private UserService(UserRepository repository){
        UserService.repository = repository;
    }

    public List<th.mfu.Domain.User> findAll(){
        return repository.findAll();
    }

    public List<th.mfu.Domain.User> findByUserId(Integer userId){
        return repository.findByUserID(userId);
    }

    public void deleteUser(Integer userId){
        repository.deleteById(userId);
    }

    public static boolean isValidUser(String phonenumb) {
        Optional<User> userOptional = repository.findByphonenumb(phonenumb);
        return userOptional.isPresent();
    }
}