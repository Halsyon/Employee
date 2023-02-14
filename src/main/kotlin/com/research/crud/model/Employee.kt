package com.research.crud.model

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Setter
@Getter
@AllArgsConstructor
@Entity(name = "employee")
data class Employee(

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "id")
        var id: Long = 0,
        var name: String = "",
        var age: Long = 0,
        var department: String = ""
)
