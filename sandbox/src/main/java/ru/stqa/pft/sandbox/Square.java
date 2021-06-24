package ru.stqa.pft.sandbox;

/**
 * Created by DSilkin on 24.06.2021.
 */
public class Square {
  public double l;

  public Square(double l) {
    this.l = l;
  }

  public double area() {

    return this.l * this.l;
  }
}
