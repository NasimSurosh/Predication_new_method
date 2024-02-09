package explination;

import java.util.List;
import java.util.function.Predicate;

public class Predicate_new_method {
  
  public static boolean isEven(Integer number) {
    return number %2==0;
  }

  public static void main(String[] args) {
    
    List<Integer> numbers = List.of(1,3,4,6,7,42,78);
   // Predicate<Integer> evenNumbers = number -> number % 2==0;
    // numbers.stream().filter(evenNumbers).forEach(System.out::println);  for even numbers
   // numbers.stream().filter(evenNumbers.negate()).forEach(System.out::println);  for odd numbers
    
   /*
    * numbers.stream() .filter(Predicate_new_method::isEven)     for even number with method
    * .forEach(System.out::println);
    */
    
    numbers.stream()
    .filter(Predicate.not(Predicate_new_method::isEven))        // odd number with method
    .forEach(System.out::println);

  }

}
