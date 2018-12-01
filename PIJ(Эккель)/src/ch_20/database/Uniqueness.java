//: annotations/database/Uniqueness.java
// Sample of nested annotations
package ch_20.database;

public @interface Uniqueness {
  Constraints constraints()
    default @Constraints(unique=true);
} ///:~
