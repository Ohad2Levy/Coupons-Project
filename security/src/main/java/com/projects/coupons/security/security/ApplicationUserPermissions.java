package com.projects.coupons.security.security;

import lombok.Getter;

@Getter
public enum ApplicationUserPermissions {
    CUSTOMER_READ("customer:read"),
    CUSTOMER_WRITE("customer:write"),
    CUSTOMER_DELETE("customer:delete"),
    CUSTOMER_OVERWRITE("customer:overwrite"),

    USER_READ("user:read"),
    USER_WRITE("user:write"),
    USER_DELETE("user:delete"),
    USER_OVERWRITE("user:overwrite");

    private final String permission;

    ApplicationUserPermissions(String permission){
        this.permission = permission;
    }

}
