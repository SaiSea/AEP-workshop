package com.thoughtworks.gilederose;

import org.junit.Assert;
import org.junit.Test;

public class AgedBrieTest {

  @Test
  public void should_update_sellin_to_0_and_update_quality_to_11_when_passed_1_days_given_agedbri_sellin_is_1_and_quality_is_10() {
    AgedBrie agedBrie = new AgedBrie(1, 10);
    agedBrie.updateSellInAndQuality();

    Assert.assertEquals(0, agedBrie.getSellin());
    Assert.assertEquals(11, agedBrie.getQuality());
  }

  @Test
  public void should_update_sellin_to_minus_1_and_update_quality_to_11_when_passed_1_days_given_agedbri_sellin_is_0_and_quality_is_10() {
    AgedBrie agedBrie = new AgedBrie(0, 10);
    agedBrie.updateSellInAndQuality();

    Assert.assertEquals(-1, agedBrie.getSellin());
    Assert.assertEquals(12, agedBrie.getQuality());
  }

  @Test
  public void should_update_sellin_to_minus_1_and_update_quality_to_50_when_passed_1_days_given_agedbri_sellin_is_0_and_quality_is_50() {
    AgedBrie agedBrie = new AgedBrie(0, 50);
    agedBrie.updateSellInAndQuality();

    Assert.assertEquals(-1, agedBrie.getSellin());
    Assert.assertEquals(50, agedBrie.getQuality());
  }

  @Test
  public void should_update_sellin_to_minus_2_and_update_quality_to_50_when_passed_1_days_given_agedbri_sellin_is_minus_1_and_quality_is_50() {
    AgedBrie agedBrie = new AgedBrie(-1, 50);
    agedBrie.updateSellInAndQuality();

    Assert.assertEquals(-2, agedBrie.getSellin());
    Assert.assertEquals(50, agedBrie.getQuality());
  }


}
