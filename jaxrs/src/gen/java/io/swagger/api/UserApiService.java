package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.InlineResponse200;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-02-11T16:41:33.225Z")
public abstract class UserApiService {
    public abstract Response userDelete(SecurityContext securityContext) throws NotFoundException;
    public abstract Response userGet( @NotNull String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userPost(SecurityContext securityContext) throws NotFoundException;
}
