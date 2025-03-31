package ec.edu.utpl.carreras.computacion.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha_hora")
    private LocalDateTime fechaHora;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "barbero_id")
    private Barbero barbero;
    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;
    private String estado;
    private String notas;

    public Cita() {
    }

    public Cita(LocalDateTime fechaHora, Cliente cliente, Barbero barbero, Servicio servicio, String estado, String notas) {
        this.fechaHora = fechaHora;
        this.cliente = cliente;
        this.barbero = barbero;
        this.servicio = servicio;
        this.estado = estado;
        this.notas = notas;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barbero getBarbero() {
        return barbero;
    }

    public void setBarbero(Barbero barbero) {
        this.barbero = barbero;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
