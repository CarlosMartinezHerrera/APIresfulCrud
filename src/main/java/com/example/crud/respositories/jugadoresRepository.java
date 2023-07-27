package com.example.crud.respositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.crud.models.jugadorModel;

@Repository
public interface jugadoresRepository extends CrudRepository<jugadorModel, Integer> {
// No hace falta declarar metodos estaticos porque etsos metodos ya estan declarados en la dependecnia CrudRepository
// fingByid()
// fingAll()
// DeleteByid()
}
