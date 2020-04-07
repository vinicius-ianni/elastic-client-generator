
package org.elasticsearch.query_dsl.full_text.intervals;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.full_text.intervals.*;

public class IntervalsContainer  implements XContentable<IntervalsContainer> {
  
  static final ParseField ALL_OF = new ParseField("all_of");
  private IntervalsAllOf _allOf;
  public IntervalsAllOf getAllOf() { return this._allOf; }
  public IntervalsContainer setAllOf(IntervalsAllOf val) { this._allOf = val; return this; }


  static final ParseField ANY_OF = new ParseField("any_of");
  private IntervalsAnyOf _anyOf;
  public IntervalsAnyOf getAnyOf() { return this._anyOf; }
  public IntervalsContainer setAnyOf(IntervalsAnyOf val) { this._anyOf = val; return this; }


  static final ParseField MATCH = new ParseField("match");
  private IntervalsMatch _match;
  public IntervalsMatch getMatch() { return this._match; }
  public IntervalsContainer setMatch(IntervalsMatch val) { this._match = val; return this; }


  static final ParseField PREFIX = new ParseField("prefix");
  private IntervalsPrefix _prefix;
  public IntervalsPrefix getPrefix() { return this._prefix; }
  public IntervalsContainer setPrefix(IntervalsPrefix val) { this._prefix = val; return this; }


  static final ParseField WILDCARD = new ParseField("wildcard");
  private IntervalsWildcard _wildcard;
  public IntervalsWildcard getWildcard() { return this._wildcard; }
  public IntervalsContainer setWildcard(IntervalsWildcard val) { this._wildcard = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IntervalsContainer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IntervalsContainer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IntervalsContainer, Void> PARSER =
    new ConstructingObjectParser<>(IntervalsContainer.class.getName(), false, args -> new IntervalsContainer());

  static {
    PARSER.declareObject(IntervalsContainer::setAllOf, (p, t) -> IntervalsAllOf.PARSER.apply(p, null), ALL_OF);
    PARSER.declareObject(IntervalsContainer::setAnyOf, (p, t) -> IntervalsAnyOf.PARSER.apply(p, null), ANY_OF);
    PARSER.declareObject(IntervalsContainer::setMatch, (p, t) -> IntervalsMatch.PARSER.apply(p, null), MATCH);
    PARSER.declareObject(IntervalsContainer::setPrefix, (p, t) -> IntervalsPrefix.PARSER.apply(p, null), PREFIX);
    PARSER.declareObject(IntervalsContainer::setWildcard, (p, t) -> IntervalsWildcard.PARSER.apply(p, null), WILDCARD);
  }

}
