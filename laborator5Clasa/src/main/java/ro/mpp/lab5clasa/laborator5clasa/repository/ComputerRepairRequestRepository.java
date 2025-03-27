package ro.mpp.lab5clasa.laborator5clasa.repository;

import ro.mpp.lab5clasa.laborator5clasa.model.ComputerRepairRequest;
import ro.mpp.lab5clasa.laborator5clasa.model.RequestStatus;

import java.util.List;

public interface ComputerRepairRequestRepository extends Repository<Integer,ComputerRepairRequest>{
    List<ComputerRepairRequest> findByOwnerName(String name);
    List<ComputerRepairRequest> findByModel(String model);
    List<ComputerRepairRequest> filterByStatus(RequestStatus status);
    List<ComputerRepairRequest> filterByModelAndStatus(String model, RequestStatus status);



}
