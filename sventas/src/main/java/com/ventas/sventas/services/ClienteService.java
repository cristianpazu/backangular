package com.ventas.sventas.services;

import com.ventas.sventas.model.Cliente;

import java.util.List;

public interface ClienteService {
    //se realiza las operaciones que vamos a utilizar

    Cliente create(Cliente cliente);

    Cliente update(Cliente cliente);

    Cliente findById(Integer id);

    List<Cliente> findAll();


    void delete(Integer id);


}
