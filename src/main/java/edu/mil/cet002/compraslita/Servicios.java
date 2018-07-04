package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;

public class Servicios {

    private List<Producto> listaDeProductos;
    private List<Comercio> listaDeComercios;
    private Mapa mapa;
    private LitaDB litaDB;

    private static final Servicios servicios = new Servicios();

    public static Servicios getInstance() {
        return servicios;
    }

    private Servicios() {
        litaDB = new LitaDB();
    }

    public List<Producto> buscarProducto(String nombre, int horario, String criterioOrden, String orden) {
        return litaDB.buscarProductoPorNombre(nombre, horario, criterioOrden, orden);
    }

    public void calificarPositivo(Comercio comercio) {
        comercio.sumarVotoPositivo();
        litaDB.actualizarComercio(comercio);
    }

    public void calificarNegativo(Comercio comercio) {
        comercio.sumarVotoNegativo();
        litaDB.actualizarComercio(comercio);
    }

    public void agregarProductoCarro(Carrito c, Producto p) {
        c.agregarAlCarrito(p);
    }

    public void eliminarProductoCarro(Carrito c, Producto p) {
        c.eliminarProducto(p);
    }

    public void calcularRecorrido(Recorrido recorrido) {

    }

    public Carrito crearCarrito() {
        return new Carrito();
    }

    public List<Producto> mostrarCarrito(Carrito c) {
        return c.getListaDeProductos();
    }

    public Mapa getMapa() {
        return litaDB.getMapa();
    }

    public Recorrido calcularRecorrido(Nodo origen, Nodo destinoFinal, List<Nodo> destinoIntermedio, int auto) {
        Mapa mapa = getMapa(); //Cargo el mapa
        Recorrido r = new Recorrido(origen, destinoFinal, destinoIntermedio, mapa, auto); //Instancio un recorrido con el origen, destino, lista nodos de lugares a visiar y auto(0/1)

        if (auto == 0) {
            r.calcularRecorrido();//si auto es 0 (false) se calcula caminando
        } else if (auto == 1) {
            r.calcularRecorridoAuto();//si auto es 1 (true) se calcula en auto
        }

        return r;
    }

}


/*
PANEL BÚSQUEDA
buscarProducto(String nombre, int horario, String criterioOrden, String ordenSentido): list<> productos
getHorarioActual();

RESULTADO BÚSQUEDA
OK agregarProductoCarro(Carrito, Producto): void

CARRO
mostrarCarro(Carrito): List<> productos
OK eliminarProducto(Carrito): void
definirDestinos(Carrito): List<> Comercios
iniciarRecorridoCaminando(nodoOrigen, nodoDestino, destinos);
iniciarRecorridoAuto(nodoOrigen, nodoDestino, destinos);
calcularPrecioTotal(Carrito);
buscarUbicacion(): nodo; // utilizado para ubicacion final e inicial

INFO COMERCIO
El codigo interno de la pantalla se encarga de obtener los datos necesarios

CALIFICACION
mostrarComerciosVisitados(Carrito): List<> Comercios
OK calificarPositivo(Comercio): void
OK calificarNegativo(Comercio): void
 */
