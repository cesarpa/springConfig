package com.example.demo.models

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component("pointFilled")
class Point(
    @Value("\${cesarX}")
    var x: Int? = null,
    @Value("\${cesarY}")
    var y: Int? = null)