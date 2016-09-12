package com.aatithya.messaging;

import java.util.LinkedHashMap;
import com.plivo.helper.api.client.*;
import com.plivo.helper.api.response.message.MessageResponse;
import com.plivo.helper.exception.PlivoException;

public class SendMessage {
    public  void messaging(String src_number, String dst_number, String text) {
        String authId = "MANGYYNGRJZDHKOWUYNJ";
        String authToken = "MjBkZWQyZDY4NjQxMDhlMjk2MzgzYmI0MzkwNDVj";
        RestAPI api = new RestAPI(authId, authToken, "v1");

        LinkedHashMap<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("src", src_number); // Sender's phone number with country code
        parameters.put("dst", dst_number); // Receiver's phone number with country code
        parameters.put("text", text); // Your SMS text message
        
        parameters.put("method", "GET"); // The method used to call the url

        try {
            // Send the message
            MessageResponse msgResponse = api.sendMessage(parameters);

            // Print the response
            System.out.println(msgResponse);
            // Print the Api ID
            System.out.println("Api ID : " + msgResponse.apiId);
            // Print the Response Message
            System.out.println("Message : " + msgResponse.message);

            if (msgResponse.serverCode == 202) {
                // Print the Message UUID
                System.out.println("Message UUID : " + msgResponse.messageUuids.get(0).toString());
            } else {
                System.out.println(msgResponse.error);
            }
        } catch (PlivoException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}