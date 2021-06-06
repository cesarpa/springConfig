package com.example.demo.models

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class Triangle(
    @Autowired
    @Qualifier("trianglePoints")
    var pointList: List<Point?>? = null,
) : Shape {

    override fun draw() {
        println("Triangle Draw: ")
        for (point in pointList!!){
            print("[${point?.x} , ${point?.y}] ")
        }
        println()
    }
}