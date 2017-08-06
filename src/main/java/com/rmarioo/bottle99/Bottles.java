package com.rmarioo.bottle99;

public class Bottles
{
  public String verse(int number)
  {
    if (number == 0)
      return
       capitalize(quantity(number)) +" " + container(number) +" of beer on the wall, " +
       quantity(number) +" " + container(number) +" of beer.\n" +
       action(number) + ", " +
       "99 bottles of beer on the wall.\n";
    else
    return
        capitalize(quantity(number)) +" " + container(number) +" of beer on the wall, " +
        quantity(number) +" " + container(number) +" of beer.\n" +
        "Take "+ pronoun(number)+" down and pass it around, " +
        quantity(number-1) +" " + container(number-1) + " of beer on the wall.\n";
  }

  private String action(int number)
  {
    return "Go to the store and buy some more";
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
}
