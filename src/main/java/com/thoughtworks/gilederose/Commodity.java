package com.thoughtworks.gilederose;

public abstract class Commodity {
  protected int sellin;

  protected int quality;

  public Commodity(int sellin, int quality) {
    this.sellin = sellin;
    this.quality = quality;
  }

  public int getSellin() {
    return sellin;
  }

  public int getQuality() {
    if (quality < 0) {
      return 0;
    } else if (quality > 50) {
      return 50;
    }
    return quality;
  }

  protected abstract void updateSellInAndQuality();
}
