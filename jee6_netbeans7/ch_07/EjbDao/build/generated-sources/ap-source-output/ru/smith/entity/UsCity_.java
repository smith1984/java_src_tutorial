package ru.smith.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.smith.entity.UsState;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-03T16:42:38")
@StaticMetamodel(UsCity.class)
public class UsCity_ { 

    public static volatile SingularAttribute<UsCity, String> zip;
    public static volatile SingularAttribute<UsCity, String> usCityNm;
    public static volatile SingularAttribute<UsCity, UsState> usStateId;
    public static volatile SingularAttribute<UsCity, Integer> usCityId;

}