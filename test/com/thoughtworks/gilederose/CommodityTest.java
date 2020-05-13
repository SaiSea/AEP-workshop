package com.thoughtworks.gilederose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommodityTest {

  @Test
  public void should_return_12_when_passed_2_days_given_agedbri_sellin_is_10_and_quality_is_10() {
    AgedBrie agedBrie = new AgedBrie(10, 10);
    agedBrie.updatedQualityBy(2);

    Assert.assertEquals(12, agedBrie.getQuality());
  }

  @Test
  public void should_return_24_when_passed_12_days_given_agedbri_sellin_is_10_and_quality_is_10() {
    AgedBrie agedBrie = new AgedBrie(10, 10);
    agedBrie.updatedQualityBy(12);

    Assert.assertEquals(24, agedBrie.getQuality());
  }

  @Test
  public void should_return_50_when_passed_12_days_given_agedbri_sellin_is_10_and_quality_is_10() {
    AgedBrie agedBrie = new AgedBrie(10, 10);
    agedBrie.updatedQualityBy(25);

    Assert.assertEquals(50, agedBrie.getQuality());
  }

  @Test
  public void should_return_50_when_passed_26_days_given_agedbri_sellin_is_10_and_quality_is_10() {
    AgedBrie agedBrie = new AgedBrie(10, 10);
    agedBrie.updatedQualityBy(26);

    Assert.assertEquals(50, agedBrie.getQuality());
  }

}
