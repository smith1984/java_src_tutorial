//: enumerated/Competitor.java
// Switching one enum on another.
package ch_19;

public interface Competitor<T extends Competitor<T>> {
  Outcome compete(T competitor);
} ///:~
