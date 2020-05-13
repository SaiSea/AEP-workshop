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

  @Test
  public void should_return_0_when_passed_10_days_given_sulfuras_quality_is_0() {
    Sulfuras sulfuras = new Sulfuras(0);
    sulfuras.updatedQualityBy(10);

    Assert.assertEquals(0, sulfuras.getQuality());
  }

  @Test
  public void should_return_0_when_passed_20_days_given_sulfuras_quality_is_0() {
    Sulfuras sulfuras = new Sulfuras(0);
    sulfuras.updatedQualityBy(20);

    Assert.assertEquals(0, sulfuras.getQuality());
  }

  @Test
  public void should_return_50_when_passed_10_days_given_sulfuras_quality_is_50() {
    Sulfuras sulfuras = new Sulfuras(50);
    sulfuras.updatedQualityBy(10);

    Assert.assertEquals(50, sulfuras.getQuality());
  }


  @Test
  public void should_return_50_when_passed_20_days_given_sulfuras_quality_is_50() {
    Sulfuras sulfuras = new Sulfuras(50);
    sulfuras.updatedQualityBy(20);

    Assert.assertEquals(50, sulfuras.getQuality());
  }

  @Test
  public void should_return_12_when_passed_2_days_given_backstagepass_sellin_is_20_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(20, 10);
    backstagePass.updatedQualityBy(2);

    Assert.assertEquals(12, backstagePass.getQuality());
  }

  @Test
  public void should_return_20_when_passed_10_days_given_backstagepass_sellin_is_20_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(20, 10);
    backstagePass.updatedQualityBy(10);

    Assert.assertEquals(20, backstagePass.getQuality());
  }

  @Test
  public void should_return_20_when_passed_12_days_given_backstagepass_sellin_is_20_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(20, 10);
    backstagePass.updatedQualityBy(12);

    Assert.assertEquals(24, backstagePass.getQuality());
  }

  @Test
  public void should_return_20_when_passed_15_days_given_backstagepass_sellin_is_20_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(20, 10);
    backstagePass.updatedQualityBy(15);

    Assert.assertEquals(30, backstagePass.getQuality());
  }

  @Test
  public void should_return_20_when_passed_16_days_given_backstagepass_sellin_is_20_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(20, 10);
    backstagePass.updatedQualityBy(16);

    Assert.assertEquals(33, backstagePass.getQuality());
  }

  @Test
  public void should_return_20_when_passed_20_days_given_backstagepass_sellin_is_20_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(20, 10);
    backstagePass.updatedQualityBy(20);

    Assert.assertEquals(45, backstagePass.getQuality());
  }

  @Test
  public void should_return_20_when_passed_21_days_given_backstagepass_sellin_is_20_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(20, 10);
    backstagePass.updatedQualityBy(21);

    Assert.assertEquals(0, backstagePass.getQuality());
  }
}
