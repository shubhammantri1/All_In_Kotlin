//Function to get Number of Digits in given Number
fun Order(Num: Int):Int{
    var count = 0
    var Num = Num
    while(Num > 0) {
        Num /= 10
        count += 1
    }
    return count
}

//Function to check Armstrong Number
fun armstrong(Num:Int, digits:Int):Int{
    var sum : Int = 0
    var Num = Num
    while(Num > 0) {
        var digit =  Num%10
        var power = powerCalculator(digit , digits)
        sum += power
        Num /= 10
    }
    return sum
}

//For Calculating Power Of digits in Armstrong Number
fun powerCalculator(digit : Int, power:Int):Int{
    var product = 1
    var power = power
    while(power > 0) {
        product *= digit
        power -= 1
    }
    return product
}

//Driver Function
fun main(){
    //Let's Take We Have To Check for 371
    val number = 371
    val digits:Int = Order(number)
    val armNum = armstrong(number, digits)
    if(armNum == number) {
        println("Number is an Armstrong Number")
    }
    else {
        println("Number is Not an Armstrong Number")
    }
}

//Output:- Armstrong Number