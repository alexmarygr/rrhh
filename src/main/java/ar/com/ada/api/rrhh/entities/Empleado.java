package ar.com.ada.api.rrhh.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Empleado {
    private int empleadoId;
    private String nombre;
    private int edad;
    private BigDecimal sueldo;
    private int estado;
    private Date fechaAlta;
    private Date fechaBaja;
    private Categoria categoriaId;
}