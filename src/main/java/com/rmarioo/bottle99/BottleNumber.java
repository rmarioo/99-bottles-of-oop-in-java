package com.rmarioo.bottle99;

public class BottleNumber
{
  private final int number;

  public BottleNumber(int number)
  {
    this.number = number;
  }

  public int  next(int number)
  {
    if (number == 0)
      return 99;
    else
      return number -1;
  }

  String action()
  {
    if  (this.number == 0)
      return "Go to the store and buy some more";
    else
      return "Take "+ pronoun()+" down and pass it around";
  }

  private String pronoun()
  {
    if (this.number == 1)
      return "it";
    else
      return "one";
  }

  String quantity()
  {
    if (this.number ==0)
      return "no more";
    else
      return String.valueOf(this.number);
  }

  String container()
  {
    if (this.number == 1)
      return "bottle";
    else
      return "bottles";
  }
}
