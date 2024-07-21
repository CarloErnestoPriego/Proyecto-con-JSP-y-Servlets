package org.carlospriego.webapp.service;

import java.util.List;
import org.carlospriego.webapp.models.Producto;

public interface IProductoService {
    public List<Producto> listarProductos();
    
    public void agregarProducto(Producto producto);
    
    public void eliminarProducto(int productoId);
    
    public void buscarProductoPorId(int productoId);
    
    public void editarProducto(Producto producto);
}
