package com.example.inheritanceapp

class Knight : HouseMember() {
    override fun showRole() {
        super.showRole() // <- call HouseMember.showRole()
        println("I serve as a Knight of the house.")
    }
}