fun main() {
    var cars=Car("Nissan", "Armada", "Black", 8)
    cars.carry(15)
    cars.identity()
    println(cars.calculateParkingFee(6))
    var bus = Bus("loyalty free","paper","red",20)
    println( bus.maxTripFare(10000.0))
    println(bus.calculateParkingFee(7))

}

open class Vehicles(var make:String,var model:String,var color:String,var capacity:Int){
    open fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else(println("Over capacity by $x people"))
    }
    open fun identity() {
        println("I am a $color $model legacy")
    }

    open fun calculateParkingFee(hours: Int): Int {
        var tatalFees = hours*20
        return tatalFees
    }

}

class Car(make:String,model:String,color:String,capacity:Int):Vehicles(make,model, color, capacity) {

}
 class Bus( make:String, model:String, color:String, capacity:Int):Vehicles(make,model, color, capacity){
    fun maxTripFare(fare:Double):Double{
        var x = fare*capacity
        return  x
    }

     override fun calculateParkingFee(hours: Int): Int {
         var y = hours*capacity
         return y
     }
 }