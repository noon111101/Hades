package com.example.buildingblock.Abstractions;

import an.awesome.pipelinr.Command;

public interface ISender {
    <R, C extends Command<R>> R send(C command);
}
