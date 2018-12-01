package ru.smith.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.smith.entity.Address;
import ru.smith.entity.UsCity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-03T16:42:38")
@StaticMetamodel(UsState.class)
public class UsState_ { 

    public static volatile SingularAttribute<UsState, String> usStateNm;
    public static volatile CollectionAttribute<UsState, Address> addressCollection;
    public static volatile CollectionAttribute<UsState, UsCity> usCityCollection;
    public static volatile SingularAttribute<UsState, String> usStateCd;
    public static volatile SingularAttribute<UsState, Integer> usStateId;

}