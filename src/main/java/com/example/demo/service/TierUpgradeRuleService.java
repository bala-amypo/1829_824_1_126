package com.example.demo.service;

import com.example.demo.entity.TierUpgradeRule;
import java.util.List;

public interface TierUpgradeRuleService {

    TierUpgradeRule create(TierUpgradeRule rule);

    TierUpgradeRule update(Long id, TierUpgradeRule rule);

    TierUpgradeRule getById(Long id);

    List<TierUpgradeRule> getAll();

    void delete(Long id);
}
