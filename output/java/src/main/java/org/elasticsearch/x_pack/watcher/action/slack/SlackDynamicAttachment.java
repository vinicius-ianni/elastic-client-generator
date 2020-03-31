
package org.elasticsearch.x_pack.watcher.action.slack;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.slack.*;

public class SlackDynamicAttachment  {
  
  private SlackAttachment _attachmentTemplate;
  public SlackAttachment getAttachmentTemplate() { return this._attachmentTemplate; }
  public SlackDynamicAttachment setAttachmentTemplate(SlackAttachment val) { this._attachmentTemplate = val; return this; }


  private String _listPath;
  public String getListPath() { return this._listPath; }
  public SlackDynamicAttachment setListPath(String val) { this._listPath = val; return this; }

}
