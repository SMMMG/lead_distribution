package fr.mmo.lead.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.mmo.lead.management.domain.entities.Broker;

public interface Brokerrepository extends JpaRepository<Broker, Long> {

}
