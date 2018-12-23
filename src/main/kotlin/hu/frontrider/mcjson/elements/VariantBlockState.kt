package hu.frontrider.mcjson.elements

class VariantBlockState {
    val variantContainer = VariantContainer()

    fun addVariant(action: VariantContainer.() -> Unit) {
            variantContainer.action()
    }

    override fun toString(): String {
        return "VariantBlockState(multipartContainer=$variantContainer)"
    }


    class VariantContainer{
        val stateContainer = StateContainer()
        var modelArray = ArrayList<MultiModelContainer>()
        fun addModel(action:MultiModelContainer.()->Unit){
            val model =MultiModelContainer()
            model.action()
            modelArray.add(model)
        }

        override fun toString(): String {
            return "VariantContainer(stateContainer=$stateContainer, modelArray=$modelArray)"
        }
    }

}

fun makeBlockstateWithVariants(action: VariantBlockState.() -> Unit): VariantBlockState {
    val variantBlockState = VariantBlockState()
    variantBlockState.action()
    return variantBlockState
}

