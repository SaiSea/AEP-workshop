package com.thoughtworks.gilederose;

import org.junit.Assert;
import org.junit.Test;

public class OrdinaryTest {

  @Test
  public void should_update_sellin_to_0_and_update_quality_to_9_when_passed_1_days_given_ordinary_sellin_is_1_and_quality_is_10() {
    Ordinary ordinary = new Ordinary(1, 10);
    ordinary.updateSellInAndQuality();

    Assert.assertEquals(0, ordinary.getSellin());
    Assert.assertEquals(9, ordinary.getQuality());
  }

  @Test
  public void should_update_sellin_to_minus_1_and_update_quality_to_8_when_passed_1_days_given_ordinary_sellin_is_0_and_quality_is_10() {
    Ordinary ordinary = new Ordinary(0, 10);
    ordinary.updateSellInAndQuality();

    Assert.assertEquals(-1, ordinary.getSellin());
    Assert.assertEquals(8, ordinary.getQuality());
  }
}
