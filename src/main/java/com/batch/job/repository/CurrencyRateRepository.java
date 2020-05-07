package com.batch.job.repository;

import com.batch.job.model.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long> {
}
