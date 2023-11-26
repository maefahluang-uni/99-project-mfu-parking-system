package th.mfu.Repositories;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;


import th.mfu.Domain.StaffStudent;

public interface StaffStudentRepository extends CrudRepository<StaffStudent, Long> {
    
    StaffStudent findbyStaffId(String phonenumb);
}