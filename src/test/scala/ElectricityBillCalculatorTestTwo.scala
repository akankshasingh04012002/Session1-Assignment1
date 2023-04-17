
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class ElectricityBillCalculatorTestTwo extends AnyFlatSpec with Matchers {

  "ElectricityBillCalculator" should "calculate bill correctly for user1" in {
    val bill1 = ElectricityBillCalculator(1001, "user1", "Delhi", 5062, 5904, 18)
    bill1.electricityBillCalculator shouldEqual 7073.51
  }

  it should "calculate bill correctly for user2" in {
    val bill2 = ElectricityBillCalculator(1002, "user2", "Mumbai", 0, 200, 18)
    bill2.electricityBillCalculator shouldEqual 1239
  }

  it should "calculate bill correctly for user3 " in {
    val bill3 = ElectricityBillCalculator(1003, "user3", "Bangalore", 0, 500, 18)
    bill3.electricityBillCalculator shouldEqual 3643.25
  }

}
