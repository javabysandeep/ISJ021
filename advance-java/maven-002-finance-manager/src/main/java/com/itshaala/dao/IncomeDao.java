package com.itshaala.dao;

import com.itshaala.model.Income;
import com.itshaala.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class IncomeDao {
    public void addIncome(Income income) {
        Connection connection = DBUtil.getConnection();
        String query = "insert into income() values(?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Income added");
    }

    public void deleteIncome(int id) {
    }

    public void updateIncome(Income income) {
    }

    public Income getIncomeById(int id) {
    }

    public List<Income> getAllIncomes() {
    }
}
