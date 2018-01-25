//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.ese.messenger.DAO;

import com.ese.messenger.model.Message;
import com.ese.messenger.model.Profile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @since Jan 18, 2018
 * @author eserbaniuc
 */
//yeah, this is just an example
public class DataBaseDAO
{

  private static Map<Long, Message> messages = new HashMap<>();
  private static Map<Long, Profile> profiles = new HashMap<>();

  public static Map<Long, Message> getMessages()
  {
    return messages;
  }

  public static Map<Long, Profile> getProfiles()
  {
    return profiles;
  }

}
