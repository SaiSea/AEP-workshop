package com.thoughtworks.gilederose;

import org.junit.Assert;
import org.junit.Test;

public class SulfurasTest {
  @Test
  public void should_update_sellin_to_1_and_update_quality_to_10_when_passed_1_days_given_sulfuras_sellin_is_1_and_quality_is_10() {
    Sulfuras sulfuras = new Sulfuras(1, 10);
    sulfuras.updateSellInAndQuality();

    Assert.assertEquals(1, sulfuras.getSellin());
    Assert.assertEquals(10, sulfuras.getQuality());
  }

  @Test
  public void should_update_sellin_to_minus_1_and_update_quality_to_10_when_passed_1_days_given_sulfuras_sellin_is_minus_1_and_quality_is_10() {
    Sulfuras sulfuras = new Sulfuras(-1, 10);
    sulfuras.updateSellInAndQuality();

    Assert.assertEquals(-1, sulfuras.getSellin());
    Assert.assertEquals(10, sulfuras.getQuality());
  }

  @Test
  public void should_update_sellin_to_1_and_update_quality_to_50_when_passed_1_days_given_sulfuras_sellin_is_1_and_quality_is_50() {
    Sulfuras sulfuras = new Sulfuras(1, 50);
    sulfuras.updateSellInAndQuality();

    Assert.assertEquals(1, sulfuras.getSellin());
    Assert.assertEquals(50, sulfuras.getQuality());
  }


  @Test
  public void should_update_sellin_to_minus_1_and_update_quality_to_50_when_passed_1_days_given_sulfuras_sellin_is_minus_1_and_quality_is_50() {
    Sulfuras sulfuras = new Sulfuras(1, 50);
    sulfuras.updateSellInAndQuality();

    Assert.assertEquals(1, sulfuras.getSellin());
    Assert.assertEquals(50, sulfuras.getQuality());
  }
}
