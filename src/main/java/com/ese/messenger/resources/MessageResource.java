//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.ese.messenger.resources;

import com.ese.messenger.model.Message;
import com.ese.messenger.service.MessageService;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *
 * @since Jan 17, 2018
 * @author eserbaniuc
 */
@Path("/messages")
public class MessageResource
{

  MessageService msgService = new MessageService();

  @GET
  @Produces(MediaType.APPLICATION_XML)
  public List<Message> getMessages()
  {
    //return "Hello World!";
    return msgService.getAllMessages();
  }
}
