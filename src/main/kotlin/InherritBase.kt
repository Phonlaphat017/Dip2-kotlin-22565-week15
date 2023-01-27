open class Animal{
    open fun gotoSleep(){
        println("Zzzzzzzzzz")
    }
    open fun makeNoise(){
        println("Durrrrrrrr")
    }
}

class Cat:Animal(){
    override fun makeNoise(){
        println("Meowwwwww")
    }
}

class Dog:Animal(){
    override fun makeNoise(){
        println("Woooooof")
    }
}
fun main(args: Array<String>){
    var animal = Cat()
    animal.makeNoise()
    animal.gotoSleep()

}