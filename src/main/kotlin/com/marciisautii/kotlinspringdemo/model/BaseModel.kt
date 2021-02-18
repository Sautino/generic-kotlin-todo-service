package com.marciisautii.kotlinspringdemo.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
open class BaseModel {
    @Id
    var id: String? = null;
}