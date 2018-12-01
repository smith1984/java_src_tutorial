package ru.smith.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.smith.entity.Customer;
import ru.smith.entity.Item;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-03T16:42:38")
@StaticMetamodel(CustomerOrder.class)
public class CustomerOrder_ { 

    public static volatile SingularAttribute<CustomerOrder, String> orderNumber;
    public static volatile CollectionAttribute<CustomerOrder, Item> itemCollection;
    public static volatile SingularAttribute<CustomerOrder, Integer> customerOrderId;
    public static volatile SingularAttribute<CustomerOrder, Customer> customerId;
    public static volatile SingularAttribute<CustomerOrder, String> orderDescription;

}