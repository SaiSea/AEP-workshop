package com.thoughtworks.gilederose;

public class BackstagePass extends Commodity {

  public BackstagePass(int sellin, int quality) {
    super(sellin, quality);
  }

  protected void updateSellInAndQuality() {
    if (sellin <= 0) {
      quality = 0;
    } else if (sellin <= 5) {
      quality += 3;
    } else if (sellin <= 10) {
      quality += 2;
    } else {
      quality += 1;
    }
    sellin -= 1;
  }
}
