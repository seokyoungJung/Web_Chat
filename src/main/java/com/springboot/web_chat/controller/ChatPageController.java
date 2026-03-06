package com.springboot.web_chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // <--- 여기서 'Rest'를 빼주세요!
public class ChatPageController {

    @GetMapping("/chat-view")
    public String chatView() {
        // @Controller 환경에서는 "Chat"을 리턴하면
        // src/main/resources/templates/Chat.html 파일을 찾아갑니다.
        return "Chat";
    }
}
