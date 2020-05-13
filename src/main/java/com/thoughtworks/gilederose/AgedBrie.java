package com.thoughtworks.gilederose;

public class AgedBrie extends Commodity {

  public AgedBrie(int sellin, int quality) {
    super(sellin, quality);
  }

  protected void updatedQualityBy(int passedDays) {
    if (passedDays <= sellin) {
      quality += passedDays;
    } else {
      quality += 10 + (passedDays - sellin) * 2;
    }
  }
}
