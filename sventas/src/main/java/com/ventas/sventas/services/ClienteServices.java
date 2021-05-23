package com.ventas.sventas.services;

import com.ventas.sventas.model.Cliente;
import com.ventas.sventas.reposity.ClienteReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServices implements ClienteService{
    // para tener acceso a los datos debemos tener a los datos usando el repository, la cual nos permite realizar las operacion
    @Autowired
    private ClienteReposity clienteRepository;


    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        Optional<Cliente> clienteoptional = clienteRepository.findById(id);
        return clienteoptional.orElse(null);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        clienteRepository.deleteById(id);
    }
    //nos encagarmos de gestionar


}
