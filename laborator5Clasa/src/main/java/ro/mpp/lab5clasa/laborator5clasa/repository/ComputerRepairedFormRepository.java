package ro.mpp.lab5clasa.laborator5clasa.repository;

import ro.mpp.lab5clasa.laborator5clasa.model.ComputerRepairedForm;

import java.util.List;

public interface ComputerRepairedFormRepository extends Repository<Integer, ComputerRepairedForm> {
    List<ComputerRepairedForm> filterByEmployee(String employee);
    List<ComputerRepairedForm> filterByEmployeeAndDate(String employee, String date);
}
