# 🪷 Gestor de Libreria

> **Una aplicación para facilitar la creación y gestión de préstamos en una biblioteca utilizando un sistema de cuentas.**

# 🪸 Introducción

En un entorno educativo, la gestión eficiente de préstamos en una biblioteca es esencial para facilitar el acceso a recursos académicos y fomentar la cultura de la lectura. Con el objetivo de mejorar y optimizar este proceso, presentamos el proyecto "Gestor de Librería" o "Sistema de gestión de préstamos de una librería", una aplicación desarrollada en Java que busca simplificar la administración de préstamos de libros y recursos bibliográficos aplicando conceptos enseñados en nuestras clases de programación orientada a eventos y programación orientada a objetos.

Este proyecto ha sido desarrollado como una herramienta interactiva y fácil de usar, diseñada para optimizar las tareas de préstamo en una biblioteca escolar. Basado en principios de programación orientada a objetos, el sistema ofrece una interfaz intuitiva que permite a los usuarios, tanto estudiantes como personal bibliotecario, realizar operaciones clave de manera eficiente.

# 🦭 Características

**Características Principales:**

+ Gestión de Préstamos: Permite a los usuarios solicitar préstamos de libros y recursos de la biblioteca, facilitando la administración de fechas de devolución e información de vencimientos.

+ Catálogo Interactivo: Ofrece un catálogo de los recursos disponibles en la biblioteca, permitiendo búsquedas por título, autor, categoría, entre otros criterios.

+ Control de Inventario: Facilita la gestión de existencias, manteniendo un registro detallado de los libros prestados, devueltos y disponibles en la biblioteca.

+ Interfaz Amigable: Diseñada con una interfaz gráfica amigable e intuitiva, accesible para usuarios de diferentes perfiles y niveles de experiencia.

**Objetivos del Proyecto:**

+ Proporcionar una herramienta digital que simplifique y agilice el proceso de préstamos en la biblioteca escolar.

+ Mejorar la organización y control de inventario, reduciendo pérdidas y agilizando la gestión de recursos bibliográficos.

+ Brindar una experiencia interactiva y eficiente tanto para el personal de la biblioteca como para los usuarios, contribuyendo al fomento de la lectura y el acceso a la información.

# 🦈 Configuración

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

# ❓ Instrucciones de uso

**Administrador:**

+ Ingrese el usuario y contraseña que estén configurados en el archivo [lib.ini](https://github.com/RiothDev/Gestor-de-Libreria/blob/main/lib.ini).
> ![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/9edda1a0-8d12-439b-a4ff-10e943b8b70d)

+ Dentro del menú, seleccione la opción que esté buscando para tener acceso al menú administrativo de ese sistema.
> ![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/82df8a53-df61-4639-bbeb-df674e431dd9)

+ En la interfaz de "libros" se encontrarán diversas opciones que facilitarán el manejo de libros en la base de datos. La opción "encontrar" permitirá renderizar resultados específicos dentro de la tabla de registros, facilitando la búsqueda en base a críterios, como el autor, nombre del libro, número del libro, etc. Para eliminar un libro, es necesario seleccionarlo dentro de la tabla principal y después presionar el botón "Remover libro". Para crear un nuevo libro necesitará presionar el botón "Crear libro" después de haber llenado todos los parámetros necesarios.
> ![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/83ccb8cf-ff2d-4918-b9ed-8d3fa88e52cb)

+ En la interfaz de "usuarios" se encontrarán las opciones de manejo de los usuarios registrados. El botón de "encontrar usuarios" permitirá filtrar en el contenido de la base de datos según críterios insertados por el administrador, por ejemplo, su nombre de usuario, su nombre, su número, etc. El botón "editar" permitirá realizar cambios en el usuario seleccionado en la base de datos según los cambios hechos en las entradas. El botón "remover" eliminará al usuario seleccionado de la base de datos.
> ![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/5e487cdf-0142-4443-acde-558276a8fbfb)

+ En la interfaz de "registros" se encuentran las opciones para el manejo de préstamos en la base de datos. La interfaz de "filtrar" ofrece filtros rápidos en los préstamos. Los préstamos expirarán una semana después de su fecha de creación automáticamente. El botón de "borrar" eliminará el préstamo seleccionado de la base de datos.
> ![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/21be804b-ad08-409d-85a2-eb5be15f91c8)

+ En la interfaz de "categorías" se encuentran las opciones para la gestión de categorías. Las categorías se utilizan como una forma de dividir libros. La opción "remover categoría" eliminará de la base de datos la categoría seleccionada en la lista, mientras que la opción "Crear categoría" creará una nueva categoría según los parámetros rellenados.
> ![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/7085d326-b034-4b16-a586-d14445fff7b3)

**Alumno:**

+ El alumno deberá crear una nueva cuenta en caso de que no cuente con una, para eso deberá llenar los campos dentro de la interfaz de "Crear cuenta", una vez sea creada la cuenta, debe llenar la información del menú principal de sesión para acceder a la interfaz de préstamos.
> ![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/f84e90cf-89ff-430d-9b79-c05b4d9f8d26)

+ Una vez sea creado el préstamo, se redireccionará a la interfaz principal de sesión para que esté lista para el siguiente usuario. El botón "encontrar libro" permitirá encontrar los libros de forma eficiente respecto a un críterio asignado por el alumno. El botón "resetear" limpiará los filtros para mostrar la base de datos completa en la tabla. El botón "Crear préstamo" creará un nuevo préstamo a nombre del alumno y el botón regresar retornará a la interfaz de sesión.
> ![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/63018815-7b6d-4a61-9e5a-3a2c8f498e9e)

# 👩👍 Funcionalidad

**Base de datos:**

+ Tabla de usuarios:
> ![Untitled-2023-11-28-0914](https://github.com/RiothDev/Gestor-de-Libreria/assets/150699852/8ddf46bd-3e07-431c-ae69-7ef0bb587552)

+ Tabla de prestamos:
> ![Untitled-2023-11-28-0914(1)](https://github.com/RiothDev/Gestor-de-Libreria/assets/150699852/2af3da9d-339a-4968-8e3a-3966a2efcd6b)

+ Tabla de libros:
> ![Untitled-2023-11-28-0914(5)](https://github.com/RiothDev/Gestor-de-Libreria/assets/150699852/246cbccb-50e6-49c1-be8d-aecf7adb3a0d)


+ Tabla de categorías:
> ![Untitled-2023-11-28-0914(4)](https://github.com/RiothDev/Gestor-de-Libreria/assets/150699852/c5ac33ba-c8f7-4443-8ba4-5daa07a6e482)


# 🛏️ Arquitectura de software

+ **Sistema de cuentas:**

![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/2ae7b358-af08-4964-8dd2-792823f60a91)

+ **Sistema de libros:**

![image](https://github.com/RiothDev/Gestor-de-Libreria/assets/109932988/d5e490cc-4a2e-4b94-af43-9b1521b4261b)

# 🪿 Consideraciones finales

Nuestro sistema de gestión de préstamos está diseñado para ofrecer una solución eficaz y práctica en el entorno académico. Este proyecto es un ejercicio práctico que pone en práctica conceptos de programación en Java y está abierto a mejoras continuas para adaptarse a las necesidades específicas de la comunidad escolar.
