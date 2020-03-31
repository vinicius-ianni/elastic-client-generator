package org.elasticsearch;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Optional;
import java.util.function.Function;

public abstract class Either<A, B> {
  protected Either() {}

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
