package ru.smith.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.smith.entity.UserRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-03T16:42:38")
@StaticMetamodel(AppUser.class)
public class AppUser_ { 

    public static volatile SingularAttribute<AppUser, String> password;
    public static volatile CollectionAttribute<AppUser, UserRole> userRoleCollection;
    public static volatile SingularAttribute<AppUser, Integer> appUserId;
    public static volatile SingularAttribute<AppUser, String> userName;

}