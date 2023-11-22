## Spring Boot, API Rest, MySQL

API Rest para el control de experiencias laborales.

La aplicacion se ejecuta en:

Metodos @GetMapping
- http://localhost:8080/trabajador
- http://localhost:8080/trabajador/find/{id}
- http://localhost:8080/experiencia
- http://localhost:8080/experiencia/find/{id}

Metodos @PostMapping
- http://localhost:8080/trabajador
  
```json
{
    "nombre": "juan",
    "apellidos": "sanz",
    "nacimiento": 2000,
    "telefono": "092345"
}
```

- http://localhost:8080/experiencia

```json
{
    "empresa": "google",
    "cargo": "jefe",
    "funciones": "dirigir",
    "trabajador": {
        "id":1
    }     
}
```
Metodos @PutMapping
- http://localhost:8080/trabajador/update/{id}
- http://localhost:8080/experiencia/update/{id}

Metodos @DeleteMapping
- http://localhost:8080/trabajador/delete/{id}
- http://localhost:8080/experiencia/delete/{id}

