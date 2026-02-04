package io.github.tiagosilva110.mini_erp.service;

import io.github.tiagosilva110.mini_erp.controller.dto.PersonDTO;
import io.github.tiagosilva110.mini_erp.model.Person;
import io.github.tiagosilva110.mini_erp.repository.DepartmentRepository;
import io.github.tiagosilva110.mini_erp.repository.PersonRepository;
import io.github.tiagosilva110.mini_erp.repository.specs.PersonSpecs;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;
    private final DepartmentRepository departmentRepository;

    public Person create(Person person){

        if (person.getContact() != null){
            person.setContact(
                    person.getContact()
            );
        }

        if (person.getAddress() != null){
            person.setAddress(
                    person.getAddress()
            );
        }

        if (person.getDepartment() != null) {
            person.setDepartment(
                    person.getDepartment()
            );

        }

        return repository.save(person);

    }

    public Person findById(UUID id) {
        Person person = repository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Person not found")
                );
        return person;
    }


    public void delete(Person person){
        repository.delete(person);
    }

    public List<Person> search(
            Boolean isPerson,
            String cpfCnpj,
            String name,
            String fantasyName,
            Integer department,
            String phone,
            String email,
            String district,
            String city,
            String country,
            String cep,
            String adress,
            String complement,
            String stateReg,
            Boolean isSupply,
            Boolean isClient,
            Boolean isEmployee,
            UUID enterprise
    ){
        Specification<Person> specs = Specification.where(((root, query, criteriaBuilder) -> criteriaBuilder.conjunction()));

        if (isPerson != null){
            specs = specs.and(PersonSpecs.isPerson(isPerson));
        }
        if (cpfCnpj != null){
            specs = specs.and(PersonSpecs.cpfCnpjEquals(cpfCnpj));
        }
        if (name != null){
            specs = specs.and(PersonSpecs.nameLike(name));
        }
        if (fantasyName != null){
            specs = specs.and(PersonSpecs.fantasyNameLike(fantasyName));
        }
        if (department != null){
            specs = specs.and(PersonSpecs.departmentEquals(department));
        }
        if (isSupply != null){
            specs = specs.and(PersonSpecs.isSupply(isSupply));
        }
        if (isClient != null){
            specs = specs.and(PersonSpecs.isClient(isClient));
        }
        if (isEmployee != null){
            specs = specs.and(PersonSpecs.isEmployee(isEmployee));
        }
        if (enterprise != null){
            specs = specs.and(PersonSpecs.enterpriseEquals(enterprise));
        }
        return repository.findAll((Sort) specs);
        }




}
