package com.example.demo

import com.example.demo.models.Shape
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.core.env.Environment
import java.util.*


fun main() {
    var context: ApplicationContext = ClassPathXmlApplicationContext("spring.xml")
    var s = context.getBean("triangle") as Shape
    s.draw()
    var c: Shape = context.getBean("circle") as Shape
    c.draw()
    println(context.getMessage("greeting", null, "Default Greeting", Locale("us")))
    val environment: Environment = context.getEnvironment()
}