package com.assignment;
import java.util.Random;
public class FlipCoin {
    public static void main(String[] args) {
      Random r = new Random();
      int chance = r.nextInt();
      if (chance == 1)
      {
          System.out.println("tails");
      }
      else {
          System.out.println("heads");
      }
    }
}
