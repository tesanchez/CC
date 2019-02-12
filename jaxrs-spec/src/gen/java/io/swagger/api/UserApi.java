package io.swagger.api;

import io.swagger.model.InlineResponse200;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user")
@Api(description = "the user API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-02-12T17:19:37.248Z")
public class UserApi {

    @GET
    @ApiOperation(value = "Gets Users.", notes = "Gets Users from employee db.", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InlineResponse200.class)
    })
    public Response userGet(@QueryParam("name") @NotNull   @ApiParam("employee")  String name) {
        return Response.ok().entity("magic!").build();
    }
}
