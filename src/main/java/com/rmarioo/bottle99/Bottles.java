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
    if (number == 0)
      return 99;
    else
      return number -1;
  }

  private String action(int number)
  {
    if  (number == 0)
      return "Go to the store and buy some more";
    else
      return "Take "+ pronoun(number)+" down and pass it around";
  }

  private String capitalize(String quantity)
  {
    return Character.toUpperCase(quantity.charAt(0))+ quantity.substring(1);
  }

  private String quantity(int number)
  {
    if (number ==0)
      return "no more";
    else
      return String.valueOf(number);
  }

  public String container(int number)
  {
    if (number == 1)
      return "bottle";
    else
      return "bottles";
  }

  private String pronoun(int number)
  {
    if (number == 1)
      return "it";
    else
      return "one";
  }

  private IntStream reverseIntRange(int from, int to)
  {
    return IntStream.range(from + 1, to + 1).map(i -> to - i + from +  1 );
  }

}
