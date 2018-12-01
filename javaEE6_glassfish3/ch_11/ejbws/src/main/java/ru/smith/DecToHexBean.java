package ru.smith;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService
public class DecToHexBean {

  public String convertDecToHex(int i) {
    return Integer.toHexString(i);
  }
}
