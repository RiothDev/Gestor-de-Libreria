# 📗 Gestor de Libreria
> **Una aplicación para facilitar la creación y gestión de préstamos en una biblioteca utilizando un sistema de cuentas.**

# 📖 Introducción
En un entorno educativo, la gestión eficiente de préstamos en una biblioteca es esencial para facilitar el acceso a recursos académicos y fomentar la cultura de la lectura. Con el objetivo de mejorar y optimizar este proceso, presentamos el proyecto "Gestor de Librería" o "Sistema de gestión de préstamos de una librería", una aplicación desarrollada en Java que busca simplificar la administración de préstamos de libros y recursos bibliográficos aplicando conceptos enseñados en nuestras clases de programación orientada a eventos y programación orientada a objetos.

Este proyecto ha sido desarrollado como una herramienta interactiva y fácil de usar, diseñada para optimizar las tareas de préstamo en una biblioteca escolar. Basado en principios de programación orientada a objetos, el sistema ofrece una interfaz intuitiva que permite a los usuarios, tanto estudiantes como personal bibliotecario, realizar operaciones clave de manera eficiente.

# ⚡ Características

**Características Principales:**

+ Gestión de Préstamos: Permite a los usuarios solicitar préstamos de libros y recursos de la biblioteca, facilitando la administración de fechas de devolución e información de vencimientos.

+ Catálogo Interactivo: Ofrece un catálogo de los recursos disponibles en la biblioteca, permitiendo búsquedas por título, autor, categoría, entre otros criterios.

+ Control de Inventario: Facilita la gestión de existencias, manteniendo un registro detallado de los libros prestados, devueltos y disponibles en la biblioteca.

+ Interfaz Amigable: Diseñada con una interfaz gráfica amigable e intuitiva, accesible para usuarios de diferentes perfiles y niveles de experiencia.

**Objetivos del Proyecto:**

+ Proporcionar una herramienta digital que simplifique y agilice el proceso de préstamos en la biblioteca escolar.

+ Mejorar la organización y control de inventario, reduciendo pérdidas y agilizando la gestión de recursos bibliográficos.

+ Brindar una experiencia interactiva y eficiente tanto para el personal de la biblioteca como para los usuarios, contribuyendo al fomento de la lectura y el acceso a la información.

# ⚙️ Configuración

**Configuración para la base de datos**

+ Instalar o contar con una herramienta de administración de bases de datos MySQL. ([Tutorial recomendado](https://youtu.be/_K2nOYwOq1E?si=L8uRHORbsTENHy9L))

+ Ejecutar la serie de consultas proporcionadas en el archivo [database.sql](https://github.com/RiothDev/Gestor-de-Libreria/blob/main/database.sql).

+ Modificar el archivo [setup.ini](https://github.com/RiothDev/Gestor-de-Libreria/blob/main/setup.ini) con la información de su base de datos.
```
url=URL de su base de datos
user=Usuario de su base de datos
password=Contraseña de su base de datos
```

+ Instalar el conector de MySQL y añadirlo dentro del proyecto de NetBeans. ([Tutorial recomendado](https://youtu.be/GCZmOfhyciY?si=eHSusrHt7ueT-Qmm))

**Configuración para el sistema administrativo**

+ Modificar el archivo [lib.ini](https://github.com/RiothDev/Gestor-de-Libreria/blob/main/lib.ini) con sus datos administrativos.
```
USER=Usuario del equipo administrativo
PASSWORD=Contraseña del equipo administrativo
```

# 📄 Instrucciones

# 💻 Arquitectura de software:
+ **Sistema de cuentas:**

![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/d26a3f4c-93a6-423d-ba1c-0964df0fc8e0)

+ **Sistema de libros:**

![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/71d97706-092f-4989-83f4-9b6ccbce28d2)

# 🍃 Consideraciones Finales:

Nuestro sistema de gestión de préstamos está diseñado para ofrecer una solución eficaz y práctica en el entorno académico. Este proyecto es un ejercicio práctico que pone en práctica conceptos de programación en Java y está abierto a mejoras continuas para adaptarse a las necesidades específicas de la comunidad escolar.
