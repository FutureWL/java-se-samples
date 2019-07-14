package io.github.futurewl.entity.projection;

import io.github.futurewl.entity.Role;
import io.github.futurewl.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Projection(name = "base", types = {User.class})
public interface UserProjection {

    String getUsername();

    @Projection(name = "summaryRole", types = Role.class)
    interface SummaryRoleProjection extends RoleProjection {

    }
}

@Projection(name = "withAuthorities", types = User.class)
interface UserProjectionWithAuthorities extends UserProjection {
    List<SummaryRoleProjection> getAuthorities();
}

