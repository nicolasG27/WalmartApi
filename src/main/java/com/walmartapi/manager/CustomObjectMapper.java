package com.walmartapi.manager;

public interface CustomObjectMapper <E, D> {
    //Los genéricos nos ayudan a generar clases sin necesidad de definir el objeto de retorno
    E mapToEntity(D dto);
    D mapToDTO(E entity);

}
