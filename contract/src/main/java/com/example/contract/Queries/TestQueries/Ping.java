package com.example.contract.Queries.TestQueries;

import com.example.buildingblock.Cqrs.Queries.IQuery;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ping implements IQuery<String> {
    public String host;

    public Ping(String host) {
        this.host = host;
    }
}
