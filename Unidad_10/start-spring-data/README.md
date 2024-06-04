# Información del proyecto

## Arranque del proyecto

```code
./mvnw spring-boot:run
```

# Rutas rest

## Métodos GET

### Obtener todos los elementos

```code
http://localhost:8090/api-rest/v1/books/
```

### Obtener un elemento

```code
http://localhost:8090/api-rest/v1/books/1
```

## Métodos POST

### Añadir un elemento


```code
http://localhost:8090/api-rest/v1/books/
```

En el body

```code
{
    "title": "El Quijote",
    "price": 19.99,
    "publishDate": "1605-01-16"
}
```

Recuerden el content type.

## Métodos delete

## Eliminar un elemento

```code
http://localhost:8090/api-rest/v1/books/
```