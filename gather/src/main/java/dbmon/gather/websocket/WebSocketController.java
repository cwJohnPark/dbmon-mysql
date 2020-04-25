package dbmon.gather.websocket;

import dbmon.gather.websocket.messagingstompwebsocket.Greeting;
import dbmon.gather.websocket.messagingstompwebsocket.HelloMessage;
import org.springframework.context.annotation.Lazy;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

import javax.annotation.PostConstruct;

@Controller
public class WebSocketController {


//    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000);
        return new Greeting("Hello," + HtmlUtils.htmlEscape(message.getName()) + "!");
    }




}
