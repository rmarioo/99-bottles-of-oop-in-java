package com.rmarioo.bottle99;

public class Bottles
{
  public String verse(int number)
  {
    if (number == 0)
      return
       "No more bottles of beer on the wall, " +
       "no more bottles of beer.\n" +
       "Go to the store and buy some more, " +
       "99 bottles of beer on the wall.\n";
    else
    if (number ==1)
      return
        quantity(number) +" bottle of beer on the wall, " +
        quantity(number) +" bottle of beer.\n" +
        "Take "+ pronoun(number)+" down and pass it around, " +
        quantity(number-1) + " bottles of beer on the wall.\n";
    else
    return
        quantity(number) +" bottles of beer on the wall, " +
        quantity(number) +" bottles of beer.\n" +
        "Take "+ pronoun(number)+" down and pass it around, " +
        quantity(number-1) +" " + container(number-1) + " of beer on the wall.\n";
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
    if (number > 1)
      return "bottles";
    else
      return "bottle";
  }

  private String pronoun(int number)
  {
    if (number == 1)
      return "it";
    else
      return "one";
  }
}
