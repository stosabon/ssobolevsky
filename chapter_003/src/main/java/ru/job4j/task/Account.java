package ru.job4j.task;

/**
 * Created by pro on 01.06.2017.
 */
public class Account {
    /**
     * Num of money.
     */
    private double value;
    /**
     * Requisites of account.
     */
    private int requisites;

    /**
     * Constructor of account.
     * @param value - value
     * @param requisites - requisites
     */
    public Account(int requisites, double value) {
        this.requisites = requisites;
        this.value = value;
    }

    /**
     * Getter for requisites.
     * @return requisites
     */
    public int getRequisites() {
        return requisites;
    }

    /**
     * Getter for value.
     * @return value
     */
    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        if (Double.compare(account.value, value) != 0) {
            return false;
        }
        return requisites == account.requisites;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + requisites;
        return result;
    }
}
