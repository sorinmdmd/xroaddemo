package edu.hsbo.akafoeHousing.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference
import java.util.Date

@Document(collection = "waitlist")
data class Waitlist (
    @Id
    val id: String? = null,
    val registrationDate: Date,

    @DocumentReference
    var wg: HousingUnit? = null
)