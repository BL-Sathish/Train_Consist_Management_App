package com.train.functional;

import com.train.model.GoodsBogie;

@FunctionalInterface
public interface SafetyRule {

    boolean validate(
            GoodsBogie bogie);
}