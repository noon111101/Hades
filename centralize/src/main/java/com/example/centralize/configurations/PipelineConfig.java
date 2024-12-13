package com.example.centralize.configurations;



import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Pipelinr;
import com.example.buildingblock.Abstractions.ISender;
import com.example.buildingblock.Services.Sender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


import java.util.List;

@Configuration
public class PipelineConfig {

    @Bean
    public Pipeline pipeline(List<Command.Handler> commandHandlers, List<Command.Middleware> middlewares) {
        return new Pipelinr()
                .with(commandHandlers::stream)
                .with(middlewares::stream);
    }

    @Bean
    public ISender sender(Pipeline pipeline) {
        return new Sender(pipeline);
    }
}
