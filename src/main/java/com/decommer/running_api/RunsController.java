package com.decommer.running_api;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/runs")
public class RunsController {
	
	final RunsRepository runsRepository;
	
	public RunsController(RunsRepository runsRepository) {
		this.runsRepository = runsRepository;
	}
	
	@CrossOrigin
	@GetMapping
	public @ResponseBody Iterable<RunData> getAllRuns() {
		return runsRepository.findAll();
	}

	@GetMapping("/{id}")
	public @ResponseBody Optional<RunData> getAllRuns(@PathVariable int id) {
		return runsRepository.findById(id);
	}

	@PostMapping
    public void addRun(@RequestBody RunData run) {
        runsRepository.save(run);
    }
}