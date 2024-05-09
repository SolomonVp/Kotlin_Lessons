package kot.extendS

class Programmer(name: String, age: Int, val language: String) : Worker(name, age) {
    override fun work() {
        println("Пишу код на языке $language")
    }
}