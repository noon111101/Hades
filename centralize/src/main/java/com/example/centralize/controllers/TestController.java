package com.example.centralize.controllers;


import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Pipelinr;
import com.example.buildingblock.Abstractions.ISender;
import com.example.buildingblock.Services.Sender;
import com.example.centralize.cqrs.queries.PingHandler;
import com.example.contract.Queries.TestQueries.Ping;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private ISender sender;

    @Operation(summary = "Ping endpoint", description = "Returns pong as response to ping query")
    @PostMapping
    public String pong(@RequestBody Ping query) {
        System.out.println("Ping query: " + query);
//        Pipeline pipeline = new Pipelinr()
//                .with(
//                        () -> Stream.of(new PingHandler())
//                );
//       return new Ping(query.host).execute(pipeline);
        return sender.send(query);
    }
}
