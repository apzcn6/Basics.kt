fun main(args: Array<String>){
    val sample1: Byte = 0x3a
    var sample2: Byte = 58
    var heartRate =85
    val deposites= 135002796.0
    val acceleration= 9.800F
    val mass = 14.6F
    var distance= 129.763001
    var lost= true
    var expensive = true
    var choice = 2
    val integral: Char = '\u222B'
    var greeting = "Hello"
    var name = "Karen"


    if( sample1 == sample2){
        println("The samples are equal")
    } else{
        println("The samples are not equal")
    }

    if(heartRate>= 40 || heartRate<= 80){
        println("Heartrate is normal")
    } else {
        println("Heartrate is not normal")
    }
    if(deposites>= 100000000){
        println("You are exceedingly wealthy")
    } else {
        println("Sorry you are so poor")
    }
    var force = mass * acceleration
    println("Force = "+ force)


    println("" +distance +" is the distance" )

    if(lost == true || expensive == true){
        println("I am really sorry! I will get my manager")
    }
    if(lost ==true || expensive == false){
        println("Here is your coupon 10% off")
    }
    when(choice) {
    1 -> println("Your choice is one")
    2 -> println("Your choice is two")
    3 -> println("Your choice is three")
        else -> {
            println("Your choice is unkown")
        }
    }

    println("" +integral + " this is an integral")
     var i = 5
    for (i in 5 until 11) {
        println("i=" +i)
    }
    var age = 0

    while(age<=6){
        println("age = "+age)
        age++
    }
    println(""+greeting +" " +name)

}