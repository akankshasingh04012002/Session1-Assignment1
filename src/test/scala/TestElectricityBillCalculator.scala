
//import org.scalatest.flatspec.AnyFlatSpec

import org.scalatest.funsuite.AnyFunSuite

class TestElectricityBillCalculator extends AnyFunSuite {
  test("testCases") {

    val bill1 = ElectricityBillCalculator(1001, "user1", "Delhi", 5062, 5904, 18)
    assert(bill1.electricityBillCalculator == 7073.51)

  }
  test("testCases2") {

    val bill2 = ElectricityBillCalculator(1002, "user2", "Mumbai", 0, 200, 18)
    assert(bill2.electricityBillCalculator == 1239)

  }
  test("testCases3") {

    val bill3 = ElectricityBillCalculator(1003, "user3", "Bangalore", 0, 500, 18)
    assert(bill3.electricityBillCalculator == 3643.25)

  }

}

