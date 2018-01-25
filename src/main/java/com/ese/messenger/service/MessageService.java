//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.ese.messenger.service;

import com.ese.messenger.DAO.DataBaseDAO;
import com.ese.messenger.model.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @since Jan 17, 2018
 * @author eserbaniuc
 */
public class MessageService
{

  private Map<Long, Message> messages = DataBaseDAO.getMessages();

  public MessageService()
  {
    messages.put(1L, new Message(1, "Hellow World", "eserbaniuc"));
    messages.put(2L, new Message(2, "Hellow World 2", "eserbaniuc"));
  }

  public List<Message> getAllMessages()
  {
    return new ArrayList<>(messages.values());
  }

  public Message getMessageById(Long id)
  {
    return messages.get(id);
  }

  public Message addMessage(Message message)
  {
    message.setId(messages.size() + 1);
    messages.put(message.getId(), message);
    return message;
  }

  public Message updateMessage(Message message)
  {
    if (message.getId() <= 0)
    {
      return null;
    }
    messages.put(message.getId(), message);
    return message;
  }

  public Message removeMessage(Long id)
  {
    return messages.remove(id);
  }

}
