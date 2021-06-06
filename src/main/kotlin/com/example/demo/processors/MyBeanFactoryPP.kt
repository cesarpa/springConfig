package com.example.demo.processors

import org.springframework.beans.factory.config.BeanFactoryPostProcessor
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory

class MyBeanFactoryPP : BeanFactoryPostProcessor{
    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {
        println("My Bean Factory Post Processor is called")
    }
}