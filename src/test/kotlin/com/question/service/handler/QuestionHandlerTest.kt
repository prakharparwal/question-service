package com.question.service.handler

import com.question.service.data.Question
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus

class QuestionHandlerTest {

    @Test
     fun `should return list of all posted questions`() {
        val questionHandler = QuestionHandler()

        val response = questionHandler.getAllQuestions();
        response.statusCode shouldBe HttpStatus.OK
        response.body shouldBe listOf(
            Question(101, "Test question?"),
            Question(102, "Another question?")
        )
    }
}