package com.decommer.running_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunsRepository extends JpaRepository<RunData, Integer> {}
