package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private Map<UUID, Customer> customerMap;

    public CustomerServiceImpl() {
        this.customerMap = new HashMap<>();

        Customer customer1 = Customer.builder()
                .id(UUID.randomUUID())
                .firstName("John")
                .lastName("Johnson")
                .email("ofuajhwoja@ex.com")
                .adress("1st Road 56")
                .build();

        Customer customer2 = Customer.builder()
                .id(UUID.randomUUID())
                .firstName("Alex")
                .lastName("Thomson")
                .email("ikcpao123@hotmail.com")
                .adress("7 A 56")
                .build();

        Customer customer3 = Customer.builder()
                .id(UUID.randomUUID())
                .firstName("Veljko")
                .lastName("Covic")
                .email("covic@gmail.com")
                .adress("Grge Jankeca")
                .build();

        customerMap.put(customer1.getId(),customer1);
        customerMap.put(customer2.getId(),customer2);
        customerMap.put(customer3.getId(),customer3);
    }

    @Override
    public List<Customer> listCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getCustomerById(UUID id) {
        return customerMap.get(id);
    }
}
