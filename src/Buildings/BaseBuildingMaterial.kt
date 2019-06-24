package Buildings

open class BaseBuildingMaterial() {
    open val numberNeeded = 1
    
    fun <T: BaseBuildingMaterial> isSmallBuilding (building: Building<T>) {
        if (building.numberNeeded < 500) {
            println("Small Building")
        } else {
            println("Large Building")
        }
    }
}
