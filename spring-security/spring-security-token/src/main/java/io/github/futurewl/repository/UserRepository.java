package io.github.futurewl.repository;

import io.github.futurewl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
