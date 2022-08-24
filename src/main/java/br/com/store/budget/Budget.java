package br.com.store.budget;

import br.com.store.budget.situation.BudgetSituation;
import br.com.store.budget.situation.UnderAnalysis;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int itensQuantity;
    private BudgetSituation situation;

    public Budget(BigDecimal value, int itensQuantity) {
        this.value = value;
        this.itensQuantity = itensQuantity;
        this.situation = new UnderAnalysis();
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItensQuantity() {
        return itensQuantity;
    }

    public BudgetSituation getSituation() {
        return situation;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }

    public void applyExtraDiscount(){
        BigDecimal extraDiscountAmount = this.situation.calculateExtraDiscountAmount(this);
        this.value = this.value.subtract(extraDiscountAmount);
    }

    public void approve(){
        this.situation.approve(this);
    }

    public void refuse(){
        this.situation.refuse(this);
    }

    public void finish(){
        this.situation.finish(this);
    }
}
