package com.projects.coupons.security.security;

import com.google.common.collect.Sets;
import lombok.Getter;

import java.util.Set;

import static com.projects.coupons.security.security.ApplicationUserPermissions.*;

@Getter
public enum ApplicationUserRoles {
    USER(Sets.newHashSet(USER_READ,USER_WRITE,USER_DELETE,USER_OVERWRITE)),
    CUSTOMER(Sets.newHashSet(CUSTOMER_READ,CUSTOMER_WRITE,CUSTOMER_DELETE,CUSTOMER_OVERWRITE)),
    ADMIN(Sets.newHashSet(CUSTOMER_READ,CUSTOMER_WRITE,CUSTOMER_DELETE,CUSTOMER_OVERWRITE
            ,USER_READ,USER_WRITE,USER_DELETE,USER_OVERWRITE));

    private final Set<ApplicationUserPermissions> permissions;

    ApplicationUserRoles(Set<ApplicationUserPermissions> permissions) {
        this.permissions = permissions;
    }
}
