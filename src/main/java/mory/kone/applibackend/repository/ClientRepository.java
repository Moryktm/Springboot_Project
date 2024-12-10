package mory.kone.applibackend.repository;

import mory.kone.applibackend.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
