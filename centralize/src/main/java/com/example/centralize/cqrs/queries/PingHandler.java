package com.example.centralize.cqrs.queries;

import an.awesome.pipelinr.Command;
import com.example.contract.Queries.TestQueries.Ping;
import org.springframework.stereotype.Component;

@Component
public class PingHandler implements Command.Handler<Ping, String> {

    @Override
    public String handle(Ping command) {
        return "Pong from " + command.host;
    }
}
