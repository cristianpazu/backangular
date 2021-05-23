package com.ventas.sventas.reposity;

import com.ventas.sventas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
//se une con el model el cliente,
public interface ClienteReposity extends JpaRepository<Cliente, Integer> {
//aqui se hace odo el crud

}
