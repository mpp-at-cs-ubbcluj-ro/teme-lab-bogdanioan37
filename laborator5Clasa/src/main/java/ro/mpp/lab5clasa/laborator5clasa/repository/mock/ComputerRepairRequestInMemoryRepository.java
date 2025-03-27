package ro.mpp.lab5clasa.laborator5clasa.repository.mock;

import ro.mpp.lab5clasa.laborator5clasa.model.ComputerRepairRequest;
import ro.mpp.lab5clasa.laborator5clasa.model.RequestStatus;
import ro.mpp.lab5clasa.laborator5clasa.repository.ComputerRepairRequestRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ComputerRepairRequestInMemoryRepository extends AbstractRepository< Integer,ComputerRepairRequest> implements ComputerRepairRequestRepository {
    public ComputerRepairRequestInMemoryRepository(){}

    @Override
    public List<ComputerRepairRequest> findByOwnerName(String name) {
        return getAll().stream().filter(x->x.getOwnerName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public List<ComputerRepairRequest> findByModel(String model) {
        return getAll().stream().filter(x->x.getModel().toLowerCase().contains(model.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public List<ComputerRepairRequest> filterByStatus(RequestStatus status) {
        return getAll().stream().filter(x->x.getStatus()==status).collect(Collectors.toList());
    }

    @Override
    public List<ComputerRepairRequest> filterByModelAndStatus(String model, RequestStatus status) {
        return getAll().stream().filter(x->x.getModel().toLowerCase().contains(model.toLowerCase()) && x.getStatus()==status).collect(Collectors.toList());
    }


}
