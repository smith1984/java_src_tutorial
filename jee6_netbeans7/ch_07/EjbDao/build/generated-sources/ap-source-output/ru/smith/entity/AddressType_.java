package ru.smith.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.smith.entity.Address;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-03T16:42:38")
@StaticMetamodel(AddressType.class)
public class AddressType_ { 

    public static volatile CollectionAttribute<AddressType, Address> addressCollection;
    public static volatile SingularAttribute<AddressType, Character> addressTypeCode;
    public static volatile SingularAttribute<AddressType, Integer> addressTypeId;
    public static volatile SingularAttribute<AddressType, String> addressTypeText;

}