package com.erecords.agents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erecords.agents.repository.AgentRepository;

import antlr.collections.List;

@RestController
@RequestMapping("/api/v1/")
public class AgentController {
	
	@Autowired
	private AgentRepository agentrepository;
	
	@GetMapping("/agents/")
	public List<Agent> getAllAgents(){
		return agentrepository.findAll();
	}
	
}
