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
@Projection(name = "base", types = {Role.class})
public interface RoleProjection {

    String getName();

    @Projection(name = "summaryUser", types = User.class)
    interface SummaryUserProjection extends UserProjection {

    }

}

@Projection(name = "withUsers", types = Role.class)
interface RoleProjectionWithUsers extends RoleProjection {
    List<SummaryUserProjection> getUsers();
}
