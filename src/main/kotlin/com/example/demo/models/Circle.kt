package com.example.demo.models

import com.example.demo.DrawEvent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy
import javax.annotation.Resource

@Component
class Circle(
    @Autowired
    @Qualifier("pointFilled")
    var pointCenter: Point? = null,
    var publisher: ApplicationEventPublisher? = null
) : Shape {
    override fun draw() {
        println("Circle Draw: \n[${pointCenter?.x}, ${pointCenter?.y}]")
        callEvent()
    }

    fun callEvent() =
        publisher?.publishEvent(DrawEvent(this))


    @PostConstruct
    fun initCircle() {
        println("post construct")
    }

    @PreDestroy
    fun destroyCircle() {
        println("pre destroy")
    }
}