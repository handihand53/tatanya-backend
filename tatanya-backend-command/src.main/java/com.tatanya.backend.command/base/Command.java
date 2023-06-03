package com.tatanya.backend.command.base;

import reactor.core.publisher.Mono;

public interface Command<R, T> {
  Mono<T> execute(R request);
}
