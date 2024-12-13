package com.example.contract.Responses;

import com.example.buildingblock.Cqrs.Respones.ModelResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ApplicationUserResponse extends ModelResponse {
    public String Email ;
    public String PhoneNumber ;
    public String FirstName ;
    public String LastName ;
    public String Avatar ;
    public boolean IsPhoneNumberVerified ;
    public long SubstituteId ;
}
