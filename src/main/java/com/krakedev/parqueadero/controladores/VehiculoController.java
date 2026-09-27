package com.krakedev.parqueadero.controladores;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.parqueadero.modelo.Auto;
import com.krakedev.parqueadero.modelo.Motocicleta;
import com.krakedev.parqueadero.modelo.Vehiculo;
import com.krakedev.parqueadero.servicios.ServicioVehiculos;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final ServicioVehiculos servicioVehiculos;

    public VehiculoController(ServicioVehiculos servicioVehiculos) {
        this.servicioVehiculos = servicioVehiculos;
    }
    
    @PostMapping("/auto")
    public String ingresarAuto(@RequestBody Auto auto) {
        boolean resultado = servicioVehiculos.ingresarVehiculo(auto);
        if (resultado) {
            return "Auto ingresado correctamente";
        }
        return "Cupo lleno o placa duplicada";
    }

    @PostMapping("/moto")
    public String ingresarMoto(@RequestBody Motocicleta moto) {
        boolean resultado = servicioVehiculos.ingresarVehiculo(moto);
        if (resultado) {
            return "Moto ingresada correctamente";
        }
        return "Cupo lleno o placa duplicada";
    }

    @GetMapping
    public ArrayList<Vehiculo> listar() {
        return servicioVehiculos.listarVehiculos();
    }

    @GetMapping("/{placa}")
    public Vehiculo buscar(@PathVariable String placa) {
        return servicioVehiculos.buscarPorPlaca(placa);
    }


}

