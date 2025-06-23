package com.example.inheritanceapp

fun main() {
    val generalMember = HouseMember()
    generalMember.showRole()
    generalMember.showCoreValues()

    println()

    val knight = Knight()
    knight.showRole()
    knight.showCoreValues()
}
