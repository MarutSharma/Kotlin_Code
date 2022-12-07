class Person(val name:String , var age:Int = 18){
    fun info(){
        println("Name is $name")
        println("Age is $age")
    }
}
fun main(){
    val p1 = Person("raju")
    val p2 = Person("rani",19)
    p1.info()
    p2.info()
    p1.age = 21
    p1.info()
}