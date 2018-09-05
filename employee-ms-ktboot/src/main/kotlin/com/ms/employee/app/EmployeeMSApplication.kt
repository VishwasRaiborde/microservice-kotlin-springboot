package ms.employee.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.ms")
open class EmployeeMSApplication{
	companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(EmployeeMSApplication::class.java, *args)
        }
    }
}


