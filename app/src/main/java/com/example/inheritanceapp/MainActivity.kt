package com.example.inheritanceapp

fun main() {
    val member = HouseMember()
    member.showRole()
    member.showCoreValues()

    println()

    val paladin = Paladin()
    paladin.showRole()
    paladin.skills()
}
