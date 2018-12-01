package ru.smith.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.smith.entity.Telephone;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-03T16:42:38")
@StaticMetamodel(TelephoneType.class)
public class TelephoneType_ { 

    public static volatile SingularAttribute<TelephoneType, Character> telephoneTypeCd;
    public static volatile CollectionAttribute<TelephoneType, Telephone> telephoneCollection;
    public static volatile SingularAttribute<TelephoneType, Integer> telephoneTypeId;
    public static volatile SingularAttribute<TelephoneType, String> telephoneTypeText;

}