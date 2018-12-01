package ru.smith.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.smith.entity.Customer;
import ru.smith.entity.TelephoneType;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-03T16:42:38")
@StaticMetamodel(Telephone.class)
public class Telephone_ { 

    public static volatile SingularAttribute<Telephone, String> telephoneNumber;
    public static volatile SingularAttribute<Telephone, Customer> customerId;
    public static volatile SingularAttribute<Telephone, TelephoneType> telephoneTypeId;
    public static volatile SingularAttribute<Telephone, Integer> telephoneId;

}