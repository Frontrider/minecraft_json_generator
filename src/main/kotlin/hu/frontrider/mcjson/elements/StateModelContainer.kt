package hu.frontrider.mcjson.elements



open class ModelContainer{
    var model=""
    var x=0f
    var y=0f
    var z =0f
    var uvlock =false
    override fun toString(): String {
        return "ModelContainer(model='$model', x=$x, y=$y, z=$z, uvlock=$uvlock)"
    }


}
class MultiModelContainer :ModelContainer(){
    var weight=1
    override fun toString(): String {
        return "MultiModelContainer(weight=$weight) ${super.toString()}"
    }
}

class StateContainer{
    var stateArray = ArrayList<StateMap>()

    fun addState(action:StateMap.()->Unit){
        val stateMap = StateMap()
        stateMap.action()
        stateArray.add(stateMap)
    }

    override fun toString(): String {
        return "StateContainer(stateArray=$stateArray)"
    }


}

class StateMap{
    var key:String =""
    var value:Any =Unit
    override fun toString(): String {
        return "StateMap(key='$key', value=$value)"
    }


}