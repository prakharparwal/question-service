package com.question.service.handler

import com.question.service.data.Question
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class QuestionHandler {

    @GetMapping("/questions")
    fun getAllQuestions(): ResponseEntity<List<Question>> {
        val temp = listOf<Question>(Question(101, "Test question?"), Question(102, "Another question?"))
        return ResponseEntity.status(HttpStatus.OK).body(temp)
    }

    @PostMapping("/add/question")
    fun addQuestion(@RequestBody question: Question){
        println(question.id)
        println(question.text)
    }
}