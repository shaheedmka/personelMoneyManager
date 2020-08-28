/**
 * @author shaheed
 **/
package com.shaheed.pmm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaheed.pmm.model.PersonModel;

@Repository
public interface PersonModelRepository extends JpaRepository<PersonModel, Long>{

	Optional<PersonModel> findByUserName(String userName);
}
