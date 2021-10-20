package com.erecords.agents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erecords.agents.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository <Agent, Long> {

}
