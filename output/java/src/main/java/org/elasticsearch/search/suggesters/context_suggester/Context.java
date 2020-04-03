package org.elasticsearch.search.suggesters.context_suggester;

import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.union.*;
import org.elasticsearch.query_dsl.geo.*;

public class Context extends Either<String, GeoLocation> { }
