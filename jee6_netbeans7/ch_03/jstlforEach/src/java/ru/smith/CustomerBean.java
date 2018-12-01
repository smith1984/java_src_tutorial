/*
 * Для изменения этого шаблона, выберите Tools | Templates
 * и откройте файл в редакторе.
 */
package ru.smith;

/**
 *
 * @author heffel
 */
public class CustomerBean {

    private String firstName;
    private String lastName;

    public CustomerBean() {

    }

    public CustomerBean(String firstName, String lastName) {
      setFirstName(firstName);
      setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
