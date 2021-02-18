package com.marciisautii.kotlinspringdemo.model

data class ToDoEntity(val title: String,
                      val description: String
) : BaseModel() {
}