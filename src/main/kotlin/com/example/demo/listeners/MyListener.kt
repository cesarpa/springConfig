package com.example.demo

import org.springframework.context.ApplicationEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class MyListener : ApplicationListener<ApplicationEvent> {
    override fun onApplicationEvent(event: ApplicationEvent) {
       println(event.toString())
    }
}

class DrawEvent(source: Any) : ApplicationEvent(source) {
  override fun toString(): String = "Listenerr -> Draw Event"
}