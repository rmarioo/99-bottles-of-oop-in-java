package com.rmarioo.bottle99;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottles
{
  public String song()
  {
    return reverseIntRange(0,99).mapToObj(this::verse)
                                 .collect(Collectors.joining(""));
  }

  public String verse(int number)
  {
    return
       capitalize(quantity(number)) +" " + container(number) +" of beer on the wall, " +
       quantity(number) +" " + container(number) +" of beer.\n" +
       action(number) + ", " +
       quantity(next(number)) +" " + container(next(number)) + " of beer on the wall.\n";
  }

  private int next(int number)
  {
    return new BottleNumber(number).next(number);
  }

  private String action(int number)
  {
    return new BottleNumber(number).action(number);
  }

  private String quantity(int number)
  {
    return new BottleNumber(number).quantity(number);
  }

  public String container(int number)
  {
    return new BottleNumber(number).container(number);
  }

  private String capitalize(String quantity)
  {
    return Character.toUpperCase(quantity.charAt(0))+ quantity.substring(1);
  }


  private IntStream reverseIntRange(int from, int to)
  {
    return IntStream.range(from + 1, to + 1).map(i -> to - i + from +  1 );
  }

}
