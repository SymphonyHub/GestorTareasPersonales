# 📘 Gestor de Tareas Personales

**Asignatura:** Patrones de Diseño  
**Profesor:** *Giovanni Caceres*  
**Alumno:** Francisco Zamorano  
**Entrega Parte 1 – Evaluación Unidad 3**

---

## 🧠 Descripción del sistema

El **Gestor de Tareas Personales** es una aplicación de consola desarrollada en Java que permite al usuario crear, listar, completar, eliminar, exportar y clonar tareas. El objetivo del sistema es facilitar la organización de tareas cotidianas mediante una solución simple pero extensible.

El proyecto implementa **cuatro patrones de diseño GoF** de manera justificada, manteniendo una estructura clara y modular.

---

## 💡 Patrones de diseño aplicados

### 1. Singleton – `SistemaTareas.java` (Patrón Creacional)

Este patrón asegura que solo exista una única instancia del controlador principal del sistema (`SistemaTareas`). Se implementa con un constructor privado y un método `getInstancia()`.  
Esto garantiza un único punto de acceso a la lógica general del programa.

### 2. Command – `Comando` y sus derivados (Patrón de Comportamiento)

Se encapsulan las acciones del usuario (crear, listar, completar, eliminar, exportar, clonar) como comandos independientes.  
Cada acción implementa la interfaz `Comando`, y se gestiona desde `GestorComandos`, permitiendo escalabilidad y separación de responsabilidades.

### 3. Adapter – `ExportadorCSV.java` (Patrón Estructural)

Se crea la interfaz `Exportador` y una clase adaptadora `ExportadorCSV` que convierte el formato de las tareas para exportarlas como texto simulando CSV.  
Esto permite separar la lógica interna de tareas del formato de salida, permitiendo cambios futuros sin modificar el núcleo.

### 4. Prototype – `Tarea.java` (Libre Elección)

La clase `Tarea` implementa `Cloneable`, permitiendo duplicar tareas existentes fácilmente.  
El usuario puede clonar una tarea existente desde el menú. Esto es útil para tareas repetitivas y demuestra reutilización de objetos.

---

## ⚙️ Instrucciones de compilación y ejecución

### Requisitos

- Java JDK 17 o superior
- IDE como NetBeans, IntelliJ o Visual Studio Code

### Estructura del proyecto

```
GestorTareasPersonales/
├── src/
│   └── cl/
│       └── zamorano/
│           └── gestortareas/
│               └── *.java
└── README.md
```

### Cómo ejecutar

1. Abre el proyecto en NetBeans.
2. Ejecuta la clase `Main.java`.
3. Utiliza las opciones del menú para interactuar con el sistema.

---

## 🧪 Ejemplo de uso

```
===== GESTOR DE TAREAS =====
1. Crear tarea
2. Listar tareas
3. Completar tarea
4. Eliminar tarea
5. Exportar tareas a CSV
6. Clonar tarea
7. Salir
Seleccione una opción:
```

---

## 📌 Notas finales

Este sistema fue desarrollado como parte de la Evaluación Unidad 3 de la asignatura **Patrones de Diseño**, cumpliendo todos los requisitos funcionales y técnicos establecidos por el profesor.

# GestorTareasPersonales
