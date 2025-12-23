package com.example.demo.service.impl;

import com.example.demo.model.TierUpgradeRule;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.TierUpgradeRuleRepository;
import com.example.demo.service.TierUpgradeRuleService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TierUpgradeRuleServiceImpl implements TierUpgradeRuleService {

    private final TierUpgradeRuleRepository repository;

    public TierUpgradeRuleServiceImpl(TierUpgradeRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public TierUpgradeRule createRule(TierUpgradeRule rule) {

        if (rule.getMinSpend() < 0 || rule.getMinVisits() < 0) {
            throw new IllegalArgumentException("Minimum values must be non-negative");
        }

        return repository.save(rule);
    }

    @Override
    public TierUpgradeRule updateRule(Long id, TierUpgradeRule updatedRule) {

        TierUpgradeRule rule = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Rule not found"));

        rule.setFromTier(updatedRule.getFromTier());
        rule.setToTier(updatedRule.getToTier());
        rule.setMinSpend(updatedRule.getMinSpend());
        rule.setMinVisits(updatedRule.getMinVisits());
        rule.setActive(updatedRule.getActive());

        return repository.save(rule);
    }

    @Override
    public List<TierUpgradeRule> getActiveRules() {
        return repository.findByActiveTrue();
    }

    @Override
    public TierUpgradeRule getRule(String fromTier, String toTier) {
        return repository.findByFromTierAndToTier(fromTier, toTier)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Rule not found"));
    }

    @Override
    public List<TierUpgradeRule> getAllRules() {
        return repository.findAll();
    }
}
