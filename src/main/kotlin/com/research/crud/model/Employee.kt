package com.research.crud.model

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter
import javax.persistence.Entity
import javax.persistence.Id

@Setter
@Getter
@AllArgsConstructor
@Entity(name = "employee")
data class Employee(

        @Id
        var id: Long = 0,
        var name: String = "",
        var age: Long = 0,
        var department: String = ""
)
