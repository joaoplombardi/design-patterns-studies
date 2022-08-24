package br.com.store.budget.situation;

import br.com.store.budget.Budget;
import br.com.store.budget.exceptions.DomainException;

import java.math.BigDecimal;

public abstract class BudgetSituation {

    public BigDecimal calculateExtraDiscountAmount(Budget budget){
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget){
        throw new DomainException("The budget cannot be approved...");
    }

    public void refuse(Budget budget){
        throw new DomainException("The budget cannot be refused...");
    }

    public void finish(Budget budget){
        throw new DomainException("The budget cannot be finished...");
    }
}
