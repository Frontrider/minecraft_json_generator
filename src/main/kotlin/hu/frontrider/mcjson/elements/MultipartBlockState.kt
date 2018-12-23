package hu.frontrider.mcjson.elements

class MultipartBlockState {

    val multipartContainers = ArrayList<MultipartContainer>()

    fun addCase(action: MultipartContainer.() -> Unit) {
        val multipartContainer = MultipartContainer()
        multipartContainer.action()
        multipartContainers.add(multipartContainer)
    }

    override fun toString(): String {
        return "MultipartBlockState(multipartContainers=$multipartContainers)"
    }

    class MultipartContainer {
        val conditions = ArrayList<StateContainer>()
        fun addCondition(action: StateContainer.() -> Unit) {
            val stateContainer =StateContainer()
            stateContainer.action()
            conditions.add(stateContainer)
        }

        var modelArray = ArrayList<MultiModelContainer>()

        fun addModel(action:MultiModelContainer.()->Unit){
            val model =MultiModelContainer()
            model.action()
            modelArray.add(model)
        }

        override fun toString(): String {
            return "MultipartContainer(conditions=$conditions, modelArray=$modelArray)"
        }


    }

}

fun makeBlockstateWithMultipart(action: MultipartBlockState.() -> Unit): MultipartBlockState {
    val variantBlockState = MultipartBlockState()
    variantBlockState.action()
    return variantBlockState
}

