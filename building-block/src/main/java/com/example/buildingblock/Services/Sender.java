package com.example.buildingblock.Services;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Pipeline;
import com.example.buildingblock.Abstractions.ISender;
import org.springframework.stereotype.Service;

@Service
public class Sender implements ISender {

    private final Pipeline pipeline;

    public Sender(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @Override
    public <R, C extends Command<R>> R send(C command) {
        return command.execute(pipeline);
    }
}
