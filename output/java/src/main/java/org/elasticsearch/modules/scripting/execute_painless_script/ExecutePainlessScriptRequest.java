
package org.elasticsearch.modules.scripting.execute_painless_script;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.scripting.execute_painless_script.*;
import org.elasticsearch.common_options.scripting.*;

public class ExecutePainlessScriptRequest  {
  
  private String _context;
  public String getContext() { return this._context; }
  public ExecutePainlessScriptRequest setContext(String val) { this._context = val; return this; }


  private PainlessContextSetup _contextSetup;
  public PainlessContextSetup getContextSetup() { return this._contextSetup; }
  public ExecutePainlessScriptRequest setContextSetup(PainlessContextSetup val) { this._contextSetup = val; return this; }


  private InlineScript _script;
  public InlineScript getScript() { return this._script; }
  public ExecutePainlessScriptRequest setScript(InlineScript val) { this._script = val; return this; }

}
