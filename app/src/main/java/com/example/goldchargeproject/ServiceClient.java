package com.example.goldchargeproject;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ServiceClient implements Runnable {
    Client theClient;
    WebTarget theWebTarget;
    Invocation.Builder invocationBuilder;
    Response theResult;
    String testString;


    public ServiceClient()
    {
        theClient = ClientBuilder.newClient();
        theWebTarget = theClient.target("http://localhost:8080/rest/").path("myresource");
        invocationBuilder = theWebTarget.request(MediaType.TEXT_PLAIN_TYPE);


        //http://localhost:8080/rest/myresource
    }



    @Override
    public void run() {
        theResult = invocationBuilder.get();
        testString = theResult.readEntity(String.class);
    }
}
