package kot.extendS

class Dog(weight: Float) : Animal("Собака", weight, "Суша" ) {
    override fun eat() {
        println("Кушаю кость...")
    }
}