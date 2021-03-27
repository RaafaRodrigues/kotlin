package com.example.continuada01.controllers

import com.example.continuada01.dominios.Boletim
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/boletins")
class BoletimController {
    val listaBoletins: MutableList<Boletim> = mutableListOf<Boletim>()

    @GetMapping
    fun getBoletins(): ResponseEntity<MutableList<Boletim>> {
        if (listaBoletins.isEmpty()) {
            return ResponseEntity.notFound().build()
        }
        return ResponseEntity.ok(listaBoletins);
    }

    @PostMapping
    fun cadastrarBoletin(@RequestBody boletim: Boletim): ResponseEntity<String> {
        if (!boletim.aluno.equals("")) {
            if (boletim.nota > 10 || boletim.nota < 0 || boletim.nota2 > 10 || boletim.nota2 < 0) {
                return ResponseEntity.badRequest().body("A nota e nota2 deve está entre 0 e 10")
            }
            listaBoletins.add(boletim);
            return ResponseEntity.status(201).build();
        }
        return ResponseEntity.badRequest().body("O campo aluno não pode ser vazio");

    }

    @GetMapping("/{posicao}")
    fun getUmBoletim(@PathVariable posicao: Int): ResponseEntity<Boletim> {

        if (posicao >= listaBoletins.size) {
            return ResponseEntity.noContent().build();
        }
        if (posicao < 0) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(listaBoletins[posicao]);
    }

    @DeleteMapping("/{posicao}")
    fun deleteUmBoletim(@PathVariable posicao: Int):ResponseEntity<Boletim>{
        if (posicao >= listaBoletins.size) {
            return ResponseEntity.noContent().build();
        }
        if (posicao < 0) {
            return ResponseEntity.badRequest().build();
        }
        listaBoletins.removeAt(posicao);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/so-os-tops")
    fun osTops() : ResponseEntity<List<Boletim>> {
        val listTop: List<Boletim> = listaBoletins.filter { boletim -> boletim.media > 9.5 }
        if(listTop.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listTop);
    }

}