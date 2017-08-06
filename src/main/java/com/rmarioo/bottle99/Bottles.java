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
    BottleNumber bottleNumber = new BottleNumber(number);
    return
       capitalize(bottleNumber.quantity()) +" " + bottleNumber.container() +" of beer on the wall, " +
       bottleNumber.quantity() +" " + bottleNumber.container() +" of beer.\n" +
       bottleNumber.action() + ", " +
       new BottleNumber(next(number)).quantity() +" " + new BottleNumber(next(number)).container() + " of beer on the wall.\n";
  }

  private int next(int number)
  {
    return new BottleNumber(number).next(number);
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
