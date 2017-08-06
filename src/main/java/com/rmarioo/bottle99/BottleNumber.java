package com.rmarioo.bottle99;

public class BottleNumber
{
  private final int number;

  public BottleNumber(int number)
  {
    this.number = number;
  }

  String action()
  {
    if  (this.number == 0)
      return "Go to the store and buy some more";
    else
      return "Take "+ pronoun()+" down and pass it around";
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

  BottleNumber next()
  {
    return new BottleNumber(this.nextNumber());
  }

  private int nextNumber()
  {
    if (this.number == 0)
      return 99;
    else
      return this.number -1;
  }

  private String pronoun()
  {
    if (this.number == 1)
      return "it";
    else
      return "one";
  }
}
