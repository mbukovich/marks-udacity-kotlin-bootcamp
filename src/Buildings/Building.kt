package Buildings

generic class Building(buildingMaterial: BaseBuildingMaterial, baseMaterialsNeeded: Int = 100) {
    val actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded
    
    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} needed to build this building.")
    }
}
