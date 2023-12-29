
package com.todocode.restauranteOk.controller;

import com.todocode.restauranteOk.Plato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestauranteController {
    
    @GetMapping ("/lista/{num_plato}")
    @ResponseBody
    public Plato traerPlatos (@PathVariable int num_plato) {
        List<Plato> listaPlatos = new ArrayList<Plato>();
        //simulamos la bd lógica agregando elementos a la lista
        listaPlatos.add(new Plato (1, "Milanesa napolitana de soja",600,"Milanesa simple, salsa, queso"));
        listaPlatos.add(new Plato (2, "Croquetas de arroz",500,"Arroz con huevo, se frita"));
        listaPlatos.add(new Plato (3, "Torrejas de acelga",400,"Acelga con huevos, se frita"));
        listaPlatos.add(new Plato (4, "Arroz integral",300.00,"Arroz con caldo y manteca"));
        listaPlatos.add(new Plato (5, "Ñoquis de papa",400,"Harina, papa, huevo y luego salsa"));

             
            for (Plato plat : listaPlatos) { 
                if (plat.getNum() == num_plato) {
                    
                    return plat; 
                }    
            }
           
        
        return null;
    }
    
}  
    
    
