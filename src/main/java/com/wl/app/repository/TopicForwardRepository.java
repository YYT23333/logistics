package com.wl.app.repository;

import com.wl.app.domain.TopicForward;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the TopicForward entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TopicForwardRepository extends JpaRepository<TopicForward, Long> {

}
