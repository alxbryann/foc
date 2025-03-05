package com.alxbryann.foc.persistence;

import com.alxbryann.foc.model.FinancialObligation;
import com.alxbryann.foc.model.Income;
import java.util.List;

/**
 *
 * @author barr2
 */
public class PersistenceController {

    private FinancialObligationJpaController foJpa = new FinancialObligationJpaController();
    private IncomeJpaController IncomeJpa = new IncomeJpaController();

    public void createFo(FinancialObligation fo) {
        foJpa.create(fo);
    }

    public List findAllFo() {
        return foJpa.findAll();
    }

    public void createIncome(Income income) {
        IncomeJpa.create(income);
    }

    public List finAllIncome() {
        return IncomeJpa.findAll();
    }

}
