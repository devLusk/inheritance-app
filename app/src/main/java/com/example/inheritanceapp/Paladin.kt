package com.example.inheritanceapp

class Paladin : Knight, Archer, HouseMember() {
    override fun showRole() {
        super<Archer>.showRole()
        println("As a Paladin, I embody the strength of a Knight and the precision of an Archer.")
    }

    override fun skills() {
        super<Archer>.skills()
        super<Knight>.skills()
        println("I also possess the ability to heal and protect my allies.")
    }
}
