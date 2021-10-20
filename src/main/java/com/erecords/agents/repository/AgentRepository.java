package com.erecords.agents.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erecords.agents.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository <Agent, Long> {

}
