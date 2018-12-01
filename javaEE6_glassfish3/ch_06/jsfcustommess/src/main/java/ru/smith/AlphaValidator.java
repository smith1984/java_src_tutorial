package ru.smith;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.apache.commons.lang.StringUtils;

@ManagedBean
public class AlphaValidator {

  public void validateAlpha(FacesContext facesContext,
      UIComponent uiComponent,
      Object value) throws ValidatorException {
    if (!StringUtils.isAlphaSpace((String) value)) {
      HtmlInputText htmlInputText = (HtmlInputText) uiComponent;
      FacesMessage facesMessage = new FacesMessage(htmlInputText.
          getLabel()
          + ": разрешены только буквенные символы.");
      throw new ValidatorException(facesMessage);
    }
  }
}
