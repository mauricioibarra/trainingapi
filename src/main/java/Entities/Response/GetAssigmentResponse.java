package Entities.Response;

import lombok.Data;

import java.util.Hashtable;

@Data
public class GetAssigmentResponse {
public  Response response;
public String cop;

public String distributorFirstName;
public String distributorLastName;

public String errorCode;

public String dsId;

public String serviceConsumer;

public String subTypeCode;

public Hashtable<String, String> flags;

public GetAssigmentResponse(){

    response = new Response();
    flags= new Hashtable<String, String>();
}

}
