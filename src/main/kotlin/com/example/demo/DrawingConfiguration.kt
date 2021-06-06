package com.example.demo

import com.example.demo.models.Circle
import com.example.demo.models.Point
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.*


@Configuration
@ComponentScan
@PropertySource("classpath:pointsConfig.properties")
class DrawingConfiguration {

    @Bean
    fun trianglePoints(): List<Point>? {
        return listOf(Point(0, 0), Point(1, 1), Point(2, 2))
    }

    @Bean
    fun centerPoint(): Point? {
        return Point(7, 7)
    }

    @Bean
    fun circle(): Circle {
        return Circle(Point(88, 88))
    }


}


