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
        number +" bottle of beer on the wall, " +
        number +" bottle of beer.\n" +
        "Take "+ pronoun(number)+" down and pass it around, " +
        "no more bottles of beer on the wall.\n";
    else
    return
        number +" bottles of beer on the wall, " +
        number +" bottles of beer.\n" +
        "Take "+ pronoun(number)+" down and pass it around, " +
        (number-1) +" " + container(number-1) + " of beer on the wall.\n";
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
