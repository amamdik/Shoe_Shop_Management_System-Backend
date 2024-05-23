package lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.service.impl;

import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.dto.CustomerDTO;
import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public boolean deleteCustomerByEmail(String id) throws NotFoundException {
        return false;
    }

    @Override
    public boolean updateCustomerById(String id, CustomerDTO CustomerDTO) throws NotFoundException {
        return false;
    }

    @Override
    public CustomerDTO getSelectCustomer(String email) throws NotFoundException {
        return null;
    }

    @Override
    public List<String> getCustomerIds() {
        return null;
    }

    @Override
    public String genarateNextID() {
        return null;
    }

    @Override
    public CustomerDTO getCustomer(String customerId) {
        return null;
    }
}
