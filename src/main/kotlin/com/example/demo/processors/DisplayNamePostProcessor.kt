package com.example.demo.processors

import org.springframework.beans.factory.config.BeanPostProcessor

class DisplayNamePostProcessor : BeanPostProcessor {
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {
        println("Before initialization $beanName")
        return bean
    }

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        println("After initialization $beanName")
        return bean
    }
}