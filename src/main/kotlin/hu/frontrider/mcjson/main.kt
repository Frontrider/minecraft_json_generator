package hu.frontrider.mcjson

import javax.script.ScriptEngineManager


fun main(args: Array<String>) {
    val manager = ScriptEngineManager()
    val engine = manager.getEngineByName("kotlin")

    engine.eval(
        """
            import hu.frontrider.mcjson.elements.*
            import hu.frontrider.mcjson.constants.*


    """.trimIndent()
    )
}
