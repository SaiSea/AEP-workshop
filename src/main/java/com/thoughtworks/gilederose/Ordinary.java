package com.thoughtworks.gilederose;

public class Ordinary extends Commodity {

  public Ordinary(int sellin, int quality) {
    super(sellin, quality);
  }

  protected void updateSellInAndQuality() {
    if (sellin > 0) {
      quality -= 1;
    } else {
      quality -= 2;
    }

    sellin -= 1;
  }
}