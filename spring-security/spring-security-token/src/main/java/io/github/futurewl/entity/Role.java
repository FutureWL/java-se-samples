package io.github.futurewl.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Data
@Entity
@ToString(exclude = "users")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "authorities")
    private List<User> users;

    @Override
    public String getAuthority() {
        return name;
    }

}
