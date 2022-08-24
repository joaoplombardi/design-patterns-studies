package br.com.store.budget.situation;

import br.com.store.budget.Budget;

public class Refused extends BudgetSituation {

    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
