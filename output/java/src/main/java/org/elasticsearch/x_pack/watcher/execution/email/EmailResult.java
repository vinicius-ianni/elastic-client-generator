
package org.elasticsearch.x_pack.watcher.execution.email;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.email.*;
import org.elasticsearch.internal.*;

public class EmailResult  {
  
  private String[] _bcc;
  public String[] getBcc() { return this._bcc; }
  public EmailResult setBcc(String[] val) { this._bcc = val; return this; }


  private EmailBody _body;
  public EmailBody getBody() { return this._body; }
  public EmailResult setBody(EmailBody val) { this._body = val; return this; }


  private String[] _cc;
  public String[] getCc() { return this._cc; }
  public EmailResult setCc(String[] val) { this._cc = val; return this; }


  private String _from;
  public String getFrom() { return this._from; }
  public EmailResult setFrom(String val) { this._from = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public EmailResult setId(String val) { this._id = val; return this; }


  private EmailPriority _priority;
  public EmailPriority getPriority() { return this._priority; }
  public EmailResult setPriority(EmailPriority val) { this._priority = val; return this; }


  private String[] _replyTo;
  public String[] getReplyTo() { return this._replyTo; }
  public EmailResult setReplyTo(String[] val) { this._replyTo = val; return this; }


  private Date _sentDate;
  public Date getSentDate() { return this._sentDate; }
  public EmailResult setSentDate(Date val) { this._sentDate = val; return this; }


  private String _subject;
  public String getSubject() { return this._subject; }
  public EmailResult setSubject(String val) { this._subject = val; return this; }


  private String[] _to;
  public String[] getTo() { return this._to; }
  public EmailResult setTo(String[] val) { this._to = val; return this; }

}
