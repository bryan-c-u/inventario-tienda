package com.inventario.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventario.tienda.entity.Producto;

// Repositorio para la entidad Producto, extiende JpaRepository para obtener métodos CRUD automáticamente
@Repository
public interface ProductosRepository extends JpaRepository<Producto, Long>{
    
}