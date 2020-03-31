
package org.elasticsearch.search.suggesters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.suggesters.completion_suggester.*;
import org.elasticsearch.search.suggesters.phrase_suggester.*;
import org.elasticsearch.search.suggesters.term_suggester.*;

public class SuggestBucket  {
  
  private CompletionSuggester _completion;
  public CompletionSuggester getCompletion() { return this._completion; }
  public SuggestBucket setCompletion(CompletionSuggester val) { this._completion = val; return this; }


  private PhraseSuggester _phrase;
  public PhraseSuggester getPhrase() { return this._phrase; }
  public SuggestBucket setPhrase(PhraseSuggester val) { this._phrase = val; return this; }


  private String _prefix;
  public String getPrefix() { return this._prefix; }
  public SuggestBucket setPrefix(String val) { this._prefix = val; return this; }


  private String _regex;
  public String getRegex() { return this._regex; }
  public SuggestBucket setRegex(String val) { this._regex = val; return this; }


  private TermSuggester _term;
  public TermSuggester getTerm() { return this._term; }
  public SuggestBucket setTerm(TermSuggester val) { this._term = val; return this; }


  private String _text;
  public String getText() { return this._text; }
  public SuggestBucket setText(String val) { this._text = val; return this; }

}
