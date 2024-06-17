package com.a1st.patientservice.repository;

import com.a1st.patientservice.model.Patient;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
  boolean existsByEmail(String email);
  boolean existsByEmailAndIdNot(String email, UUID id);
}
