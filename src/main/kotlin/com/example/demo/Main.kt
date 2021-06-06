package com.example.demo

import com.example.demo.models.Shape
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.core.env.Environment
import java.util.*

fun main() {
    var applicationContext = AnnotationConfigApplicationContext(DrawingConfiguration::class.java)
    var s: Shape = applicationContext.getBean("triangle") as Shape
    s.draw()

    var c = applicationContext.getBean("circle") as Shape
    c.draw()

    val environment: Environment = applicationContext.getEnvironment()
    println(environment.getProperty("APP_NAME"))

    println(applicationContext.getMessage("greeting", null, "Default Greeting", Locale("us")))
}
