package za.ac.cput.schoolmanagement.service.entity;

import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.repository.entity.NameRepositoryimp;

import java.util.Optional;
@Service
public class NameServiveImpl implements NameService {
    private final NameRepositoryimp repository;

    public NameServiveImpl(NameRepositoryimp repository) {
        this.repository = repository;
    }


    @Override
    public Name save(Name name) {
        return this.repository.save(name);
    }

    @Override
    public Optional<Name> read(String s) {
        return Optional.empty();
    }

    @Override
    public void delete(Name name) {

    }
}
