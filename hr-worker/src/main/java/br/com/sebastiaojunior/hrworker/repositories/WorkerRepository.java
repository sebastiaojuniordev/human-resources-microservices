package br.com.sebastiaojunior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sebastiaojunior.hrworker.entites.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
