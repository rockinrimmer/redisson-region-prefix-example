package uk.co.crimmer.redissonregionprefixexample;

import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<CachedEntity, Long> {
}
