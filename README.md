# Challenge Clean Architecture App

Es un proyecto con patron Clean Architecture en Android. 
Nos permite consultar elementos y detalles de una API, por medio, de interface dinamica. 

## Experiencia de usuario

Algunas caracteristicas son:

* Pantalla inicio con opciones:
    * Listado de elementos.
    * Listado de elementos favoritos.
* Pantalla de detalles.
* Guardar tu elemento preferido.

## Guía de implementación

### Trabajando con la API openSource

EL API utilizado se encuentra en la siguiente página: 
https://rickandmortyapi.com/documentation/

### Arquitectura

ESe aplican buenas prácticas de la arquitectura limpia (Clean Architecture)

#### Capas

* App: UI.
* Presentación: View Models.
* Casos de uso: GetAllCharactersUseCase, GetEpisodeFromCharacterUseCase, etc.
* Dominio: Character, Episode, Location, etc.
* Datos: CharacterRepository, LocalCharacterDataSource, etc.
* Framework: ImageManager, DatabaseManager, RequestManager.

### Persistencia de datos - Room

### Administrador de solicitudes: Retrofit

### Biblioteca de imágenes - Glide


### Inyección de dependencia - Dagger

## Copyright

following site: https://rickandmortyapi.com/