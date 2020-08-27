package edu.knoldus.util

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UtilsSpec extends AnyFlatSpec with Matchers{
  "A utils add method" should "add two numbers" in {
    Utils.add(2, 3) shouldBe 5
  }

  it should "format the correct date " in {
    Utils.dateForTimestamp(System.currentTimeMillis()) shouldBe "27-08-2020"
  }
}
