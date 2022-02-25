



fun main(args: Array<String>) {

//    val x = 1
//    val y = 1
//    val a = 35
//    val b = 15
//    val g = egcd(a, b, x, y)
//
//    print("gcd(" + a + " , " + b + ") = " + g)

    //print(args[0]);

    if (args[0] == "euclidean") {

    }

}



fun egcd(a: Int, b: Int, x: Int?, y: Int?): Int {

    var px = x
    var py = y

    if (a == 0) {
        px = 0
        py = 1;
        return b;
    }

    var x1 = 1
    var y1 = 1

    var gcd = egcd(b % a, a, x1, y1)

    px = y1 - (b / a) * x1
    py = x1
    return gcd
}