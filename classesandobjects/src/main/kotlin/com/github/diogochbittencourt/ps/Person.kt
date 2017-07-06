package com.github.diogochbittencourt.ps

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {
//    var isMarried = false

    var partnerName: String =""

//    constructor(name: String, age: Int, isMarried: Boolean) : this(name, age) {
//        this.isMarried = isMarried
//    }

    init {
        if (name == "Kevin" && age > 80) throw Exception("Invalid age")
    }

    override fun sign() = println("$name aged $age can sign documents (and theur marital status is $isMarried) and his partner name is $partnerName")

//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            val p = Person("Kevin", 21, true)
//            p.sign()
//            p.age = 54
//            p.sign()
//        }
//    }
}

class Student(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>) {
    val p = Person("Kevin", 21, true)
    p.sign()
    p.age = 54
    p.partnerName = "Alice"
    p.sign()

    print("${p.partnerName} is his partner.")

    p.partnerName = "Bob"

    print("\n${p.partnerName} is his partner.")
}