package com.example.inheritanceapp

class SecondaryClass : BaseClass() {
    override fun role() {
        super.role() // <- chama BaseClass.role()
        println("Knight of the House BaseClass")
    }
}