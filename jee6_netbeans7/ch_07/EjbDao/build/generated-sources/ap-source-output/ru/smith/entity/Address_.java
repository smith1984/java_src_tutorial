package ru.smith.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.smith.entity.AddressType;
import ru.smith.entity.Customer;
import ru.smith.entity.UsState;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-03T16:42:38")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> zip;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, AddressType> addressTypeId;
    public static volatile SingularAttribute<Address, String> addrLine2;
    public static volatile SingularAttribute<Address, String> addrLine1;
    public static volatile SingularAttribute<Address, Customer> customerId;
    public static volatile SingularAttribute<Address, UsState> usStateId;
    public static volatile SingularAttribute<Address, Integer> addressId;

}