fun main(){
    val l = 10
    val m = 20
    val n = 30

    println("l>m && l>n : ${l>m && l>n}")      //false
    println("m>l && m>n : ${m>l && m>n}")      //false
    println("n>l && n>m : ${n>l && n>m}")      //true

    println("m<n || n<l : ${m<n || n<l}")       //true
    println("!(l>m): ${!(l>m)}")                //true
}