Ventajas
- Acceso controlado a la unica instancia de la clase
- Para conectarnos a una base de datos o un web service solo querremos tener una instancia de dicha clase

Desventaja
- Dificil de testear ya que guarda la misma referencia. Uso de inyeccion de dependencias en vez de singleton.