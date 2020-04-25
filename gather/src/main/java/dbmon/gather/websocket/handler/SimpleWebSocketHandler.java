package dbmon.gather.websocket.handler;

import dbmon.gather.websocket.messagingstompwebsocket.Greeting;
import dbmon.gather.websocket.messagingstompwebsocket.HelloMessage;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import org.springframework.web.util.HtmlUtils;

@Configuration
public class SimpleWebSocketHandler {

    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000);
        return new Greeting("Hello," + HtmlUtils.htmlEscape(message.getName()) + "!");
    }


}
