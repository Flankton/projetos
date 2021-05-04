package william.apiwill.Repository;

import org.springframework.data.repository.CrudRepository;
import william.apiwill.Model.UserModel;


public interface UserRepository extends CrudRepository<UserModel,Integer> {
}
