setDomain("mod")

val state = makeBlockstateWithVariants{
    addVariant{
        stateContainer.addState{
            key="name"
            value=true
        }
        addModel{
            model = "minecraft/block/stone"
        }
    }
}

println(state)
val state1 = makeBlockstateWithMultipart{
    addCase{
        addCondition{
            addState{
                key="powered"
                value=true
            }
            addState{
                key="facing"
                value="east"
            }
        }
        addModel{
            model = "minecraft/block/stone"
        }
    }
    addCase{
        addCondition{
            addState{
                key="powered"
                value=true
            }
            addState{
                key="facing"
                value="west"
            }
        }
        addModel{
            model = "minecraft/block/stone"
        }
    }
}
println(state1)