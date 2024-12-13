package com.example.contract.Queries.ApplicationUserQueries;



import com.example.buildingblock.Cqrs.Queries.IQuery;
import com.example.contract.Responses.ApplicationUserResponse;
import lombok.Data;

@Data
public final class GetApplicationUserQuery implements IQuery<ApplicationUserResponse> {

    private final String id;

}