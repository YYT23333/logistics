package com.wl.app.service;

import com.wl.app.domain.TopicFabulous;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing TopicFabulous.
 */
public interface TopicFabulousService {

    /**
     * Save a topicFabulous.
     *
     * @param topicFabulous the entity to save
     * @return the persisted entity
     */
    TopicFabulous save(TopicFabulous topicFabulous);

    /**
     * Get all the topicFabulous.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<TopicFabulous> findAll(Pageable pageable);


    /**
     * Get the "id" topicFabulous.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<TopicFabulous> findOne(Long id);

    /**
     * Delete the "id" topicFabulous.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the topicFabulous corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<TopicFabulous> search(String query, Pageable pageable);
}
