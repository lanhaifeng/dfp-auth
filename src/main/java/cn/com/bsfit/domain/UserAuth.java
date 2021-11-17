package cn.com.bsfit.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.io.Serializable;
import java.util.Collection;

/**
 * dfp-auth
 * 2021/11/16 0:20
 * 描述一下类的用途
 *
 * @author lanhaifeng
 * @since
 **/
@Getter
@Setter
public class UserAuth extends User implements Serializable {

    private String clientId;
    private String id;

    public UserAuth(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public UserAuth(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
