package com.example.buildingblock.Cqrs.Queries;

import an.awesome.pipelinr.Command;

public interface IQuery<TResult> extends Command<TResult> {
}
