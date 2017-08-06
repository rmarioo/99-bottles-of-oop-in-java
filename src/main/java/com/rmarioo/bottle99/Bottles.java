package com.rmarioo.bottle99;

public class Bottles
{
  public String verse(int number)
  {
    if (number == 2)
      return
        "2 bottles of beer on the wall, " +
        "2 bottles of beer.\n" +
        "Take one down and pass it around, " +
        "1 bottle of beer on the wall.\n";
    else
    if (number == 3)
      return
        number +" bottles of beer on the wall, " +
        number +" bottles of beer.\n" +
        "Take one down and pass it around, " +
        "2 bottles of beer on the wall.\n";
    else
    return
        number +" bottles of beer on the wall, " +
        number +" bottles of beer.\n" +
        "Take one down and pass it around, " +
        "98 bottles of beer on the wall.\n";
  }
}
