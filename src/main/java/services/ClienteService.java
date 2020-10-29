package services;

import dtos.ArticuloDTO;
import dtos.ClienteDTO;

public interface ClienteService {

    public void ingresarCliente(ClienteDTO clienteDTO);
    public void consultarCliente(Integer idCliente);

}
