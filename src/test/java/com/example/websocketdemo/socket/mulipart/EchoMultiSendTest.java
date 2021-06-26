package com.example.websocketdemo.socket.mulipart;

import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * jdk方式使用socket,可以支持多个socket,client关闭后,server不关闭
 */
public class EchoMultiSendTest {

    @Test
    public void givenClient1_whenServerResponds_thenCorrect() throws IOException {
        EchoMultiClient client1 = new EchoMultiClient();
        client1.startConnection("127.0.0.1", 4567);
        String msg1 = client1.sendMessage("hello,sb");
        String msg2 = client1.sendMessage("world,sb");
        String terminate = client1.sendMessage(".");

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(terminate);
    }

    @Test
    public void givenClient2_whenServerResponds_thenCorrect() throws IOException {
        EchoMultiClient client2 = new EchoMultiClient();
        client2.startConnection("127.0.0.1", 4567);
        String msg1 = client2.sendMessage("hello,sd");
        String msg2 = client2.sendMessage("world,sd");
        String terminate = client2.sendMessage(".");

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(terminate);
    }
}
