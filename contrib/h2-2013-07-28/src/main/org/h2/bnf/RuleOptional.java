/*
 * Copyright 2004-2013 H2 Group. Multiple-Licensed under the H2 License,
 * Version 1.0, and under the Eclipse Public License, Version 1.0
 * (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.bnf;

import java.util.HashMap;

/**
 * Represents an optional BNF rule.
 */
class RuleOptional implements Rule {
    private final Rule rule;
    private boolean mapSet;

    RuleOptional(Rule rule) {
        this.rule = rule;
    }

    @Override
    public void accept(BnfVisitor visitor) {
        visitor.visitRuleOptional(rule);
    }

    @Override
    public void setLinks(HashMap<String, RuleHead> ruleMap) {
        if (!mapSet) {
            rule.setLinks(ruleMap);
            mapSet = true;
        }
    }
    @Override
    public boolean autoComplete(Sentence sentence) {
        sentence.stopIfRequired();
        rule.autoComplete(sentence);
        return true;
    }

}
