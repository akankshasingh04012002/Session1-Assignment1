
case class ElectricityBillCalculator(accountNumber: Int, username: String, address: String, previousUnit: Int, currentUnit: Int,  gstCharges: Double) {

  def electricityBillCalculator: Double = {

    val priceSlab1: Double = 5.25
    val priceSlab2: Double = 6.75
    val priceSlab3: Double = 8.50

    val slab1Limit: Int = 250
    val slab2Limit: Int = 450

    val totalUnits: Int = currentUnit - previousUnit

    val amount: Double = if (totalUnits <= slab1Limit) {
      totalUnits * priceSlab1
    } else if (totalUnits <= slab2Limit) {
      slab1Limit * priceSlab1 + (totalUnits - slab1Limit) * priceSlab2
    } else {
      slab1Limit * priceSlab1 + (slab2Limit - slab1Limit) * priceSlab2 + (totalUnits - slab2Limit) * priceSlab3
    }

    val gstRate: Double = 18
    val gstAmount = amount * (gstRate / 100)
    val totalAmount = amount + gstAmount
    totalAmount
  }

}

