package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUserName(String userName);


User findByEmail(String email);
}