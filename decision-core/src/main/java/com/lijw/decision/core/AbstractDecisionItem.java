package com.lijw.decision.core;

import com.lijw.decision.core.util.StringUtils;

public abstract class AbstractDecisionItem implements DecisionItem {

    /** 决策项名称 */
    protected String decisionItemName;

    public AbstractDecisionItem() {
        this.decisionItemName = StringUtils.getCamelName(getClass());
    }

    @Override
    public String getName() {
        return decisionItemName;
    }

}
