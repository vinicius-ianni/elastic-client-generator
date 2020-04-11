package org.elasticsearch;

import org.elasticsearch.common.xcontent.ConstructingObjectParser;
import org.elasticsearch.mapping.meta_fields.source.SourceField;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Optional;
import java.util.function.Function;

public class Either<A, B> {
  // TODO should be protected after we fix the generated Either parsing
  public Either() {}

  public <C> C map(Function<? super A, ? extends C> left,
                      Function<? super B, ? extends C> right) {
    throw new NotImplementedException();
  }

  public static <A, B> Either<A,B> left(A value) {
    return new Either<A,B>() {
      @Override
      public <C> C map(
        Function<? super A, ? extends C> left,
        Function<? super B, ? extends C> right) {
        return left.apply(value);
      }
    };
  }

  public static <A, B> Either<A,B> right(B value) {
    return new Either<A,B>() {
      @Override
      public <C> C map(
        Function<? super A, ? extends C> left,
        Function<? super B, ? extends C> right) {
        return right.apply(value);
      }
    };
  }
}
