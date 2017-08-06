package com.rmarioo.bottle99;

public class BottleNumber
{
  public int  next(int number)
  {
    if (number == 0)
      return 99;
    else
      return number -1;
  }

  String action(int number)
  {
    if  (number == 0)
      return "Go to the store and buy some more";
    else
      return "Take "+ pronoun(number)+" down and pass it around";
  }

  private String pronoun(int number)
  {
    if (number == 1)
      return "it";
    else
      return "one";
  }

  String quantity(int number)
  {
    if (number ==0)
      return "no more";
    else
      return String.valueOf(number);
  }
}
