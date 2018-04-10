package com.netkumar.code.one.com.netkumar.code.three;

import com.netkumar.code.two.SendMessage;

public class Main {
    public static void main(String ...args){
        System.out.println("Calling data from external module");
        SendMessage sendMeg = new SendMessage();
        sendMeg.sendMyMessage("Hey Bro");
    }
}
