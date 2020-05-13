package com.thoughtworks.gilederose;

public class BackstagePass extends Commodity {

  public BackstagePass(int sellin, int quality) {
    super(sellin, quality);
  }

  protected void updatedQualityBy(int passedDays) {
    if (passedDays > sellin) {
      quality = 0;
    } else if (passedDays > 15) {
      quality += 20 + (passedDays - 15) * 3;
    } else if (passedDays > 10) {
      quality += 10 + (passedDays - 10) * 2;
    } else {
      quality += passedDays;
    }
  }
}
