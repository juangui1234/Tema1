# 🐾 Proyecto Java: Acceso, Herencia y Cast Seguro con Mascotas

Este proyecto demuestra varios conceptos clave de la programación orientada a objetos en Java, utilizando el ejemplo de una clínica veterinaria con distintas clases de mascotas.

---

## 🧠 ¿Qué aprenderás con este código?

- ✅ Uso de **modificadores de acceso** (`private`, `default`, `protected`, `public`)
- ✅ Implementación de **herencia** entre clases (`Mascota`, `Perro`, `Gato`)
- ✅ Comprobación de tipos con **`instanceof`**
- ✅ Uso de **cast seguro** para evitar errores en tiempo de ejecución
- ✅ Acceso a miembros desde el **mismo paquete** y desde **paquetes externos**

---

## 📦 Estructura del proyecto

```plaintext
src/
├── mascota/
│   ├── Mascota.java
│   ├── Perro.java
│   ├── Gato.java
│   ├── ClinicaVeterinaria.java
│   ├── TestCasting.java
│   ├── TestCastingSeguro.java
│   ├── AccesoMismoPaquete.java
│   └── Main.java
└── externo/
    └── AccesoExterno.java
📁 Descripción de clases
Mascota.java
Clase base con atributos con distintos modificadores de acceso y métodos con distintos niveles de visibilidad.

Perro.java y Gato.java
Subclases de Mascota que agregan comportamientos (ladrar, maullar).

ClinicaVeterinaria.java
Simula una clínica que recibe mascotas y aplica polimorfismo para identificar el tipo real del objeto.

TestCasting.java
Demuestra qué pasa si casteas un objeto sin usar instanceof → lanza ClassCastException.

TestCastingSeguro.java
Ejemplo correcto usando instanceof antes de hacer el cast.

AccesoMismoPaquete.java
Muestra qué atributos y métodos se pueden usar desde la misma clase y paquete.

Main.java (en paquete mascota)
Simula el flujo general de una clínica recibiendo distintas mascotas.

AccesoExterno.java (en paquete externo)
Muestra cómo los modificadores de acceso limitan el uso desde otro paquete.

🧪 Ejemplo de salida
yaml
Copiar
Editar
Recibiendo a: Toby
Hola, soy Toby
Toby dice: ¡Guau!
Recibiendo a: Pelusa
Hola, soy Pelusa
Pelusa dice: ¡Miau!
No es un perro, no se puede ladrar.
Método público
⚠️ Análisis reflexivo
¿Qué pasa si se envía una clase que no hereda de Mascota?

Java lanza un error de compilación. Solo se pueden pasar objetos que hereden de Mascota.

¿Qué pasa si eliminas el instanceof y casteas directamente?

Se lanza una ClassCastException en tiempo de ejecución si el objeto no es del tipo esperado.

🚀 Requisitos
Java JDK 8 o superior

NetBeans, IntelliJ IDEA o cualquier IDE compatible

🧑‍💻 Autor
Proyecto educativo desarrollado por [Juan Guillermo Salazar] como parte del aprendizaje en programación orientada a objetos en Java.