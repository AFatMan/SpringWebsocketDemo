package com.example.websocketdemo.socket.single;

import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * jdk方式使用socket,仅接受单个socket连接,client关闭后,server关闭
 */
public class SingleSendTest {
    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        System.out.println(response);
    }

    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect_2() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server2");
        System.out.println(response);
    }
}
