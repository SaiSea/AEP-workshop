package com.thoughtworks.gilederose;


import org.junit.Assert;
import org.junit.Test;

public class BackstagePassTest {
  @Test
  public void should_update_sellin_to_10_and_update_quality_to_11_when_passed_1_days_given_backstagepass_sellin_is_11_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(11, 10);
    backstagePass.updateSellInAndQuality();

    Assert.assertEquals(10, backstagePass.getSellin());
    Assert.assertEquals(11, backstagePass.getQuality());
  }

  @Test
  public void should_update_sellin_to_9_and_update_quality_to_12_when_passed_1_days_given_backstagepass_sellin_is_11_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(10, 10);
    backstagePass.updateSellInAndQuality();

    Assert.assertEquals(9, backstagePass.getSellin());
    Assert.assertEquals(12, backstagePass.getQuality());
  }

  @Test
  public void should_update_sellin_to_5_and_update_quality_to_12_when_passed_1_days_given_backstagepass_sellin_is_6_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(6, 10);
    backstagePass.updateSellInAndQuality();

    Assert.assertEquals(5, backstagePass.getSellin());
    Assert.assertEquals(12, backstagePass.getQuality());
  }

  @Test
  public void should_update_sellin_to_0_and_update_quality_to_13_when_passed_1_days_given_backstagepass_sellin_is_1_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(1, 10);
    backstagePass.updateSellInAndQuality();

    Assert.assertEquals(0, backstagePass.getSellin());
    Assert.assertEquals(13, backstagePass.getQuality());
  }

  @Test
  public void should_update_sellin_to_minus_1_and_update_quality_to_0_when_passed_1_days_given_backstagepass_sellin_is_0_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(0, 10);
    backstagePass.updateSellInAndQuality();

    Assert.assertEquals(-1, backstagePass.getSellin());
    Assert.assertEquals(0, backstagePass.getQuality());
  }

  @Test
  public void should_update_sellin_to_minus_2_and_update_quality_to_0_when_passed_1_days_given_backstagepass_sellin_is_minus_1_and_quality_is_10() {
    BackstagePass backstagePass = new BackstagePass(-1, 10);
    backstagePass.updateSellInAndQuality();

    Assert.assertEquals(-2, backstagePass.getSellin());
    Assert.assertEquals(0, backstagePass.getQuality());
  }

  @Test
  public void should_update_sellin_to_0_and_update_quality_to_50_when_passed_1_days_given_backstagepass_sellin_is_1_and_quality_is_50() {
    BackstagePass backstagePass = new BackstagePass(1, 50);
    backstagePass.updateSellInAndQuality();

    Assert.assertEquals(0, backstagePass.getSellin());
    Assert.assertEquals(50, backstagePass.getQuality());
  }
}
