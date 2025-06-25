package com.example.inheritanceapp

fun main() {
    val generalMember = HouseMember()
    generalMember.showRole()
    generalMember.showCoreValues()

    println()

    val paladin = Paladin()
    paladin.showRole()
    paladin.skills()
}
