package ru.smith.beans;

import javax.inject.Named;
import ru.smith.qualifiers.Premium;

@Named
@Premium
public class PremiumCustomer extends Customer {

  private Integer discountCode;

  public Integer getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(Integer discountCode) {
    this.discountCode = discountCode;
  }
}
