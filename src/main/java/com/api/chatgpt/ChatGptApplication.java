package com.api.chatgpt;

import com.theokanning.openai.edit.EditRequest;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatGptApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatGptApplication.class, args);

        var service = new OpenAiService("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");

        var request = EditRequest.builder()
                .model("text-davinci-edit-001")
                .input("i Jack, I like programn in java, how abt you")
                .instruction("Fix the grammar and spelling mistakes")
                .build();

        service.createEdit(request).getChoices().forEach(System.out::println);
    }
}
