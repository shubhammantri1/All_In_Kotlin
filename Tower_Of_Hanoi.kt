import java.util.*

fun towerOfHanoi(disks: Int, barFrom: Char, barTo: Char, barAuxillary: Char):Int {
    if (disks == 1) {
        println("Move disk 1 From $barFrom to $barTo")
        return 1
    }
    towerOfHanoi(disks - 1, barFrom, barAuxillary, barTo)
    println("Move disk $disks form $barFrom to $barTo")
    towerOfHanoi(disks - 1, barAuxillary, barTo, barFrom)
return 0
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please Enter number of disks : ")
    val disks = scanner.nextInt()
    towerOfHanoi(disks, 'A', 'B', 'C')
}