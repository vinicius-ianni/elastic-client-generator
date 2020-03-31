
package org.elasticsearch.search.suggesters.completion_suggester;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.suggesters.context_suggester.*;
import org.elasticsearch.search.suggesters.completion_suggester.*;

public class CompletionSuggester  {
  
  private Map<String, SuggestContextQuery[]> _contexts;
  public Map<String, SuggestContextQuery[]> getContexts() { return this._contexts; }
  public CompletionSuggester setContexts(Map<String, SuggestContextQuery[]> val) { this._contexts = val; return this; }


  private SuggestFuzziness _fuzzy;
  public SuggestFuzziness getFuzzy() { return this._fuzzy; }
  public CompletionSuggester setFuzzy(SuggestFuzziness val) { this._fuzzy = val; return this; }


  private String _prefix;
  public String getPrefix() { return this._prefix; }
  public CompletionSuggester setPrefix(String val) { this._prefix = val; return this; }


  private String _regex;
  public String getRegex() { return this._regex; }
  public CompletionSuggester setRegex(String val) { this._regex = val; return this; }


  private Boolean _skipDuplicates;
  public Boolean getSkipDuplicates() { return this._skipDuplicates; }
  public CompletionSuggester setSkipDuplicates(Boolean val) { this._skipDuplicates = val; return this; }

}
